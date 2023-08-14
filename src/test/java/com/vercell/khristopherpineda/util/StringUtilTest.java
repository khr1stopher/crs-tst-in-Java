package com.vercell.khristopherpineda.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("something", StringUtil.repeat("something", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("somethingsomethingsomething", StringUtil.repeat("something", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("something", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        Assert.assertEquals("", StringUtil.repeat("something", -1));
    }
}