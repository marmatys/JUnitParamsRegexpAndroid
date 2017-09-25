package com.example.marmatys.paramtest;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.regex.Pattern;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnitParamsRunner.class)
public class ExampleUnitTest {
    @Test
    @Parameters({ "123", "456" })
    public void string_length(String string) throws Exception {
        assertEquals(string.length(), 3);
    }
}