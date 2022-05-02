package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import test.lib1.Lib1;

public class ServiceTest {

    public final Lib1 lib1 = new Lib1();

    @Test
    public void testLib1() {
        assertNotNull(lib1);
    }
}
