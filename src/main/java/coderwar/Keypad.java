package coderwar;

import edu.princeton.cs.algs4.In;

/**
 * @author cl
 * @version $Id: Keypad v 0.1 2019-02-21 16:27 cl Exp $$
 */
public class Keypad {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';

        char[] chars = {'A', 'B','R', 'S'};
        String.valueOf(81);
        for (char ch : chars) {
            int val = ch;
            //System.out.println(ch%3);
            if (Character.isDigit(ch)){
                val = val +14;
            }
            System.out.println(ch + " : "+val);
        }

     //   System.out.println(presses("WHERE DO U WANT 2 MEET L8R"));

    }


    public static int presses(String phrase) {
        if (phrase == null || phrase == "") {
            return 0;
        }
        int presses = 0;
        char[] chars = phrase.toCharArray();
        for (char c:chars){
            if (" ".equals(c)){
                presses++;
                continue;
            }
            if (Character.isDigit(c)){
                presses +=4;
            }
            int incr  = (c + 1) % 3 + 1;
            presses += incr;
        }
        return presses;
    }

}
