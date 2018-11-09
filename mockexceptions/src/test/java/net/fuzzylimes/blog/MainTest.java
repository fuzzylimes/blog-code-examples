package net.fuzzylimes.blog;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

public class MainTest {

    Helper helper;

    @Before
    public void setUp() throws Exception {
        helper = Mockito.mock(Helper.class);
    }

    @Ignore
    @Test(expected = DummyException.class)
    public void checkIfEqualFail() throws DummyException {
        when(helper.doSomething()).thenThrow(new IOException());
        Main main = new Main();
        main.checkIfEqual("ABC", "abc", helper);
    }

    @Test(expected = DummyException.class)
    public void checkIfEqualGood() throws DummyException {
        //when(helper.doSomething()).thenThrow(new IOException());
        //given(helper.doSomething()).willThrow(new IOException());
        given(helper.doSomething()).willAnswer(invocation -> { throw new IOException();});
        Main main = new Main();
        main.checkIfEqual("ABC", "abc", helper);
    }
}