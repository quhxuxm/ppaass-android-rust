package com.ppaass.androidwithrust;

public class RustGreetings {

    private static native String greeting(final String pattern);

    public String sayHello(String to) {
        return greeting(to);
    }
}
