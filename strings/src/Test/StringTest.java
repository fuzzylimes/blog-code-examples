import org.junit.Test;

public class StringTest {

    @Test
    public void stringBuilderTest() {
        StringBuilder myString = new StringBuilder();

        String name = "Bob";

        myString.append("Hello there, ");
        myString.append(name);
        myString.append("!");
        myString.toString();

        System.out.println(myString);
    }

    @Test
    public void stringReassignTest() {
        String a = "Test";
        a += " case";
        System.out.println(a);
    }

    @Test
    public void printNumbersTest() {
        Long l = 12345567889l;
        System.out.println(String.valueOf(l));
    }
}
