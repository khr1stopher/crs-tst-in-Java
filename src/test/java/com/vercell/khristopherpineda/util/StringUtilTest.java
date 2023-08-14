package com.vercell.khristopherpineda.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals("somethingsomethingsomething", StringUtil.repeat("something", 3));
        Assert.assertEquals("something", StringUtil.repeat("something", 1));
    }
}