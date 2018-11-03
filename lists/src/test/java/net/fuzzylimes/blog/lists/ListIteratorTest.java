package net.fuzzylimes.blog.lists;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    @Test
    public void arrayListIterator() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        ListIterator<Product> iterator = products.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void arrayListIteratorIndex() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        ListIterator<Product> iterator = products.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.nextIndex());
            System.out.println(iterator.next());
            System.out.println(iterator.previousIndex());
        }
    }

    @Test
    public void arrayListIteratorAdd() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        ListIterator<Product> iterator = products.listIterator();

        while (iterator.hasNext()) {
            Product pro = iterator.next();
            if (pro.getName().equals(ProductFixtures.chair.getName())) {
                iterator.add(ProductFixtures.table);
            }
        }

        System.out.println(products);
        Assert.assertThat(products, Matchers.contains(ProductFixtures.table, ProductFixtures.chair, ProductFixtures.table, ProductFixtures.lamp));
    }

    @Test
    public void arrayListIteratorSet() {
        List<Product> products = new ArrayList<>();
        products.add(ProductFixtures.table);
        products.add(ProductFixtures.chair);
        products.add(ProductFixtures.lamp);

        ListIterator<Product> iterator = products.listIterator();

        while (iterator.hasNext()) {
            Product pro = iterator.next();
            if (pro.getName().equals(ProductFixtures.chair.getName())) {
                iterator.set(ProductFixtures.table);
            }
        }

        Assert.assertThat(products, Matchers.contains(ProductFixtures.table, ProductFixtures.table, ProductFixtures.lamp));
//        Assert.assertThat(products, Matchers.everyItem(Matchers.not(Matchers.isIn(new Product[]{ProductFixtures.chair}))));
    }
}
