package Unittesting;
import org.junit.Test;

import static  org.junit.Assert.*;

public class MyUnitTest {
    @Test
    void testConcat() {
        MyUnit myUnit=new MyUnit();
        String result= myUnit.concat("one","two");
        assertEquals("onetwo",result);
    }
}
