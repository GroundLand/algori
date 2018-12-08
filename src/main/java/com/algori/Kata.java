package com.algori;

/**
 *
 * @author cl
 * @version $Id: Kata.java v 0.1 18-11-22 上午10:03 cl Exp $$
 */
public class Kata {
    public static void main(String args[]){
        String s = "!";
        s.intern();
    }

    public static String HighAndLow(String numbers) {
        String[] strs = numbers.split(" ");
        int[] integers = new int[strs.length];
        for (int i = 0; i <strs.length ; i++) {
            integers[i] = Integer.valueOf(strs[i]);
        }

        int min = integers[1];
        int max = integers[1];
        for (int i=1;i<integers.length;i++){
            if (integers[i]<min)
                min = integers[i];
            if (integers[i]>max)
                max = integers[i];
        }

        return max+" "+min;
    }
}
