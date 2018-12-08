package com.algori.chapterOne.third;

import edu.princeton.cs.algs4.Stack;

/**
 * @author cln
 * @version $Id: Evaluate.java v 0.1 18-12-8 上午10:10 cln Exp $$
 */
public class Evaluate {

    public static void main(String[] args) {
        String[] strs = "(1+((2+3)*(4*5)))".split("");

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        int i = 0;
        while (i<strs.length) {
            //如果读取的是字符串
            String s = strs[i];
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                vals.push(v);
            } else vals.push(Double.parseDouble(s));
            i++;
        }
        System.out.println(vals);
    }
}
