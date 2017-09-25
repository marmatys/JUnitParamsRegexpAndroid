package com.example.marmatys.paramtest;

import android.test.InstrumentationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;

import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnitParamsRunner.class)
public class ExampleInstrumentedJUnitParamsTest extends InstrumentationTestCase {
    @Test
    @Parameters({ "123", "456" })
    public void string_length(String string) throws Exception {
        assertEquals(string.length(), 3);
    }
}
