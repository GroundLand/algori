package com.algori.chapterTwo.third;

import com.algori.util.StringUtils;
import edu.princeton.cs.algs4.Multiway;
import edu.princeton.cs.algs4.Quick;

import java.util.Arrays;

/**
 * @author cl
 * @version $Id: QuickTest v 0.1 2018-12-29 14:55 cl Exp $$
 */
public class QuickTest {
    public static void main(String[] args) {
        String[] strings = StringUtils.splitString("KRATELEPUIMQCXOS","");
        Quick.sort(strings);
        System.out.println(Arrays.toString(strings));
        Multiway.main(new String[]{"A","B","C","B","C","D"});
    }
}
