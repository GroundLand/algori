package com.algori;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author cl
 * @version $Id: Test1.java v 0.1 18-11-22 下午1:53 cl Exp $$
 */
public class Test1 {

    @Test
    public void Test1() {
        assertEquals("42 -9", Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void SingleTest(){
        assertTrue(true||true&&false);
    }
}
