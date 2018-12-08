package com.algori.chapterOne;

import com.algori.chapterOne.first.BinarySearch;
import com.algori.chapterOne.second.Palindrome;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author cln
 * @version $Id: ChapterOneTest.java v 0.1 18-11-23 下午9:22 cln Exp $$
 */
public class ChapterOneTest {

    @Test
    public void test1(){
       int  a[] = {1,2,3,4,5,6};
       Assert.assertEquals(4, BinarySearch.rank(5,a));
    }

    @Test
    public void test2(){
        assertTrue(Palindrome.isPalindrome("121"));
        assertFalse(Palindrome.isPalindrome("12222222"));
        assertTrue(Palindrome.isPalindrome("111222111"));
    }
}
