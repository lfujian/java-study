package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JunitTest {

    @Test
    public void testTT() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        String s = null;
        assertEquals("a", s1);
        assertEquals("b", s2);
        assertEquals("c", s3);
        assertEquals("d", s4);
        assertNull(s);
    }

}
