package com.algori;

import coderwar.BraceChecker;
import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void sellTest() {
        Integer a[] = {12, 21, 3, 4, 5, 6, 7, 8, 9, 10, 12, 1};
        Shell.sort(a);
        StdOut.println(Arrays.toString(a));
    }
    BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("([{}])"));
        assertEquals(false,checker.isValid("{{"));
        assertEquals(false,checker.isValid("[(])"));
        assertEquals(false,checker.isValid("[({})](]"));
    }

    @Test
    public void testConcurrent(){
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
       // integers.add(4);
        integers.add(3);

        for (Integer i : integers){
            if (i==3)
                integers.remove(i);
        }
    }
}
