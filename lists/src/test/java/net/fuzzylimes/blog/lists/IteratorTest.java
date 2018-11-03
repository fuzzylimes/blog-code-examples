package net.fuzzylimes.blog.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    @Test
    public void arrayIterator() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(products);
    }

    @Test
    public void arrayIteratorGetNextFalse() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void arrayIteratorForEachRemaining() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        Iterator<Product> iterator = products.iterator();

        iterator.forEachRemaining(n -> {
            System.out.println(n);
        });

        System.out.println(products);
    }

    @Test
    public void arrayIteratorRemove() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {
            Product val = iterator.next();
            if (val.getWeightInLbs() > 30) {
                iterator.remove();
            }
        }

        System.out.println(products);
    }

    @Test
    public void collectionRemoveIf() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        products.removeIf(val -> val.getWeightInLbs() > 30);

        System.out.println(products);
    }

}
