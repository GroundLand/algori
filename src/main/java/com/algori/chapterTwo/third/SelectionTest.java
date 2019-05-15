package com.algori.chapterTwo.third;

import edu.princeton.cs.algs4.StdArrayIO;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * @author cl
 * @version $Id: SelectionTest v 0.1 2019-03-19 14:29 cl Exp $$
 */
public class SelectionTest {

    public static void sort(int[] array){
        int N=array.length;
        for(int i=0;i<N-1;i++){
            //最小值
            int min = i;
            for(int j=i+1;j<N;j++){
                if(array[i]>array[j]) min=j;
                //交换
                change(array,i,min);
            }
        }
    }

    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    private static void change(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,};
        sort(arr);
        StdArrayIO.print(arr);
        String dateStr = DateTimeFormat.forPattern("yyyyMMdd").print(DateTime.now());
        System.out.println(dateStr);
    }
}
