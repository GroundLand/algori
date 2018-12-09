package com.algori.chapterOne.third;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author cl
 * @version $Id: Reverse.java v 0.1 18-11-26 上午10:43 cl Exp $$
 */
public class Reverse {
    public static void main(String[] args){
        String str = "";
        while (!StdIn.isEmpty()){
            str = StdIn.readString();
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c:chars){
            stack.push(c);
        }

        for (char i:stack){
            StdOut.print(i);
        }
    }
}
