package com.algori.chapterOne.second;

/**
 * 回文
 * @author cl
 * @version $Id: Palindrome.java v 0.1 18-11-24 上午9:48 cl Exp $$
 */
public class Palindrome {
    public static boolean isPalindrome(String str) {
        int N = str.length();
        for (int i = 0; i < N / 2; i++)
            if (str.charAt(i) != str.charAt(N - i - 1))
                return false;
        return true;
    }
}
