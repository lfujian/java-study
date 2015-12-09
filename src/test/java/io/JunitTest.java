package io;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

    @Test
    public void test() {
        String a = "a";
        String b = "b";
        assertEquals("a", a);
        assertEquals("b", b);
    }

}
