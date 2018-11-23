package com.algori.algri4.chapterOne.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author cln
 * @version $Id: ChapterOneTest.java v 0.1 18-11-23 下午9:22 cln Exp $$
 */
public class ChapterOneTest {

    @Test
    public void test1(){
       int  a[] = {1,2,3,4,5,6};
       assertEquals(4,BinarySearch.rank(5,a));
    }
}
