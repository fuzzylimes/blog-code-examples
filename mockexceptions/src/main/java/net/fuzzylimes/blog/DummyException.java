package net.fuzzylimes.blog;

public class DummyException extends Exception {
        public DummyException() { super(); }
        public DummyException(String message) { super(message); }
        public DummyException(String message, Throwable cause) { super(message, cause); }
        public DummyException(Throwable cause) { super(cause); }
}
