import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MonthTest {

    @Test
    public void monthEnumTest() {
        Assert.assertEquals(Month.January, Month.valueOf("January"));
        assertNotNull(Arrays.stream(Month.values()).filter(e -> e.name().equalsIgnoreCase("january")).findAny().orElse(null));
        assertNull(Arrays.stream(Month.values()).filter(e -> e.name().equalsIgnoreCase("jne")).findAny().orElse(null));
    }

}