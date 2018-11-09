package net.fuzzylimes.blog;

import java.io.IOException;

public class Helper {

    public boolean doSomething() throws DummyException {
        try {
            System.out.println("Hello World");
            return true;
        }
        catch (Exception e) {
            throw new DummyException("Something went wrong");
        }
    }

    public void throwError() throws IOException {

    }
}
