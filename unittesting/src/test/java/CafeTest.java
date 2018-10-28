import org.junit.Assert;
import org.junit.Test;

public class CafeTest {

    public static final CoffeeType ESPRESSO = CoffeeType.Espresso;
    public static final int ESPRESSO_BEANS = ESPRESSO.getRequiredBeans();
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;
    public static final CoffeeType LATTE = CoffeeType.Latte;

    @Test
    public void canBrewEspressoTest() {
        Cafe cafe = cafeWithBeans();

        Coffee coffee = cafe.brew(ESPRESSO);

        Assert.assertEquals(ESPRESSO, coffee.getType());
        Assert.assertEquals(NO_MILK, coffee.getMilk());
        Assert.assertEquals(ESPRESSO_BEANS, coffee.getBeans());
    }

    @Test
    public void brewingEspressoConsumesBeansTest() {
        Cafe cafe = cafeWithBeans();

        Coffee coffee = cafe.brew(ESPRESSO);

        Assert.assertEquals(NO_BEANS, cafe.getBeansInStock());
    }

    @Test(expected = IllegalStateException.class)
    public void lattesRequireMilkTest() {
        Cafe cafe = cafeWithBeans();

        Coffee coffee = cafe.brew(LATTE);

    }

    private Cafe cafeWithBeans() {
        Cafe cafe = new Cafe();
        cafe.restockBeans(ESPRESSO_BEANS);
        return cafe;
    }
}