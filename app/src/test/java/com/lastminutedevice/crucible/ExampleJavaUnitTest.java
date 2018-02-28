package com.lastminutedevice.crucible;

import org.junit.Test;

import static com.lastminutedevice.crucible.UtilsKt.almostDeadCode;
import static com.lastminutedevice.crucible.UtilsKt.generateString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
public class ExampleJavaUnitTest {

    @Test
    public void testGenerateString() {
        String text = generateString();
        assertNotNull(text);
    }

    @Test
    public void testAlmostDeadCode() {
        // Execute this item _only_ from unit tests (verify that unit test coverage is unique)
        assertTrue(almostDeadCode());
    }
}
