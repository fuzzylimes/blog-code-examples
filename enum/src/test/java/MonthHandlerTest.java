import org.junit.Assert;
import org.junit.Test;


public class MonthHandlerTest {

    @Test
    public void checkMonthInIfStatementOctoberTest() {

        MonthHandler monthHandler = new MonthHandler();

        int result = monthHandler.enumInIfStatement(Month.October);

        Assert.assertEquals(10, result);
    }

    @Test
    public void checkMonthInSwitchStatementOctoberTest() {

        MonthHandler monthHandler = new MonthHandler();

        int result = monthHandler.enumInSwitchStatement(Month.October);

        Assert.assertEquals(10, result);
    }

    @Test
    public void enumValuesTest() {
        for(Month month: Month.values()) {
            System.out.println(month);
        }
    }

    @Test
    public void valueInEnumTest() {
        MonthHandler monthHandler = new MonthHandler();

        Assert.assertTrue(monthHandler.valueInEnum("January"));
        Assert.assertTrue(monthHandler.valueInEnum("january"));
        Assert.assertTrue(monthHandler.valueInEnum("JANUARY"));
    }
}