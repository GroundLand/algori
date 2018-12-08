package com.algori.chapterOne.third;

import edu.princeton.cs.algs4.Stack;

/**
 * @author cl 对应题目 1.3.4
 * @version $Id: Parentheses.java v 0.1 18-12-8 下午12:52 cl Exp $$
 */
public class Parentheses {


    //parentheses  括号
    private static final char LEFT_PAREN = '(';

    private static final char RIGHT_PAREN = ')';

    private static final char LEFT_BRACKET = '[';

    private static final char RIGHT_BRACKET = ']';

    private static final char LEFT_BRACE = '{';

    private static final char RIGHT_BRACE = '}';

    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        boolean result = isBalanced(str);
        System.out.println(result);
    }

    //是否完整匹配
    public static boolean isBalanced(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        Stack<Character> left = new Stack<>();
        while (i < chars.length) {

            char s = chars[i];
            if (s == LEFT_PAREN) left.push(s);
            else if (s == LEFT_BRACKET) left.push(s);
            else if (s == LEFT_BRACE) left.push(s);
            else if (left.isEmpty()){
                return false;
            }
            else if (s == RIGHT_PAREN) {
                if (left.pop() != LEFT_PAREN) return false;
            } else if (s == RIGHT_BRACKET) {
                if (left.pop() != LEFT_BRACKET) return false;
            } else if (s == RIGHT_BRACE) {
                if (left.pop() != LEFT_BRACE) return false;
            }
            i++;
        }

        //如果不为空，则匹配也不完整
        return left.isEmpty();
    }
}
