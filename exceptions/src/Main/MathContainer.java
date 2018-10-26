public class MathContainer {
    public int div(int a, int b) throws Exception {
        try {
            return a / b;
        } catch(Exception e) {
            if (a < 3) {
                throw e;
            } else if (3 <= a && a < 8) {
                throw new RuntimeException("This is a runtime exception");
            } else {
                throw new Exception("This is a normal exception");
            }
        }
    }
}
