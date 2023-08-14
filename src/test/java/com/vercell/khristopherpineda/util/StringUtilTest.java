package com.vercell.khristopherpineda.util;

//import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("something", 3), "somethingsomethingsomething");

        assertEquals(StringUtil.repeat("something", 1), "something");

    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " in not equal to expected " + expected);
        }
    }
}