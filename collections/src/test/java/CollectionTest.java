import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

    Product table, chair, lamp;
    Collection<Product> products;

    @Before
    public void setUp() {
        table = new Product(45, "Old Table");
        chair = new Product(10, "Hard Chair");
        lamp = new Product(5, "Dim Lamp");
        products = new ArrayList<Product>();
    }

    @Test
    public void testCollectionSize() {
        products.add(table);
        products.add(lamp);
        Assert.assertEquals("Wrong number of items", 2, products.size());
    }

    @Test
    public void testCollectionIsEmpty() {
        Assert.assertTrue(products.isEmpty());
    }

    @Test
    public void testCollectionIsEmptyFalse() {
        products.add(table);
        Assert.assertFalse(products.isEmpty());
    }

    @Test
    public void testAddAllToCollection() {
        products.add(table);
        products.add(chair);

        Collection<Product> moreProducts = new ArrayList<Product>();
        moreProducts.add(lamp);
        moreProducts.add(table);

        products.addAll(moreProducts);

        Assert.assertEquals(4, products.size());
        Assert.assertEquals(2, moreProducts.size());
    }

    @Test
    public void testRemoveElement() {
        products.add(chair);
        products.add(table);

        Assert.assertEquals(2, products.size());

        products.remove(table);

        Assert.assertEquals(1, products.size());
        Assert.assertFalse(products.contains(table));
    }

    @Test
    public void testRemoveAllElements() {
        products.add(table);
        products.add(chair);

        Collection<Product> moreProducts = new ArrayList<Product>();
        moreProducts.add(lamp);
        moreProducts.add(table);

        products.removeAll(moreProducts);

        Assert.assertEquals(1, products.size());
        Assert.assertFalse(products.contains(table));
    }

    @Test
    public void testRetainAllElements() {
        products.add(table);
        products.add(chair);

        Collection<Product> moreProducts = new ArrayList<Product>();
        moreProducts.add(lamp);
        moreProducts.add(table);

        products.retainAll(moreProducts);

        Assert.assertEquals(1, products.size());
        Assert.assertTrue(products.contains(table));
    }

    @Test
    public void testContainsAllElements() {
        products.add(table);
        products.add(chair);

        Collection<Product> moreProducts = new ArrayList<Product>();
        moreProducts.add(lamp);
        moreProducts.add(table);

        Assert.assertFalse(products.containsAll(moreProducts));
    }

    @Test
    public void testClearAllElements() {
        products.add(table);
        products.add(chair);
        products.add(lamp);

        Assert.assertEquals(3, products.size());

        products.clear();

        Assert.assertEquals(0, products.size());
    }
}
