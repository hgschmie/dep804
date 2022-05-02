package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import test.lib2.Lib2;


public class LibraryTest {

    public final Lib2 lib2 = new Lib2();

    @Test
    public void testLib2() {
        assertNotNull(lib2);
    }

}
