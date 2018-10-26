import org.junit.Test;

import static org.junit.Assert.*;

public class MathContainerTest {

    @Test
    public void divTestArithmetic() {
        MathContainer mc = new MathContainer();
        try {
            int res = mc.div(2, 0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception hit: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception hit: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception hit: " + e.getMessage());
        }
    }

    @Test
    public void divTestRuntime() {
        MathContainer mc = new MathContainer();
        try {
            int res = mc.div(5, 0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception hit: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception hit: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception hit: " + e.getMessage());
        }
    }

    @Test
    public void divTestException() {
        MathContainer mc = new MathContainer();
        try {
            int res = mc.div(8, 0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception hit: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception hit: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception hit: " + e.getMessage());
        }
    }
}