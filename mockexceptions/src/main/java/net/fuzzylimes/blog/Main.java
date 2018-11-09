package net.fuzzylimes.blog;

import java.io.IOException;

public class Main {
    
    public boolean checkIfEqual(String str1, String str2, Helper helper) throws DummyException {
        try {
            boolean a = helper.doSomething();
            helper.throwError();
            return str1.equalsIgnoreCase(str2);
        } catch (DummyException de) {
            throw new DummyException(de);
        } catch (IOException ex) {
            throw new DummyException(ex);
        }
    }

}
