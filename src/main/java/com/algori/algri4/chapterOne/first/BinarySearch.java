package com.algori.algri4.chapterOne.first;

/**
 *
 * @author cln
 * @version $Id: BinarySearch.java v 0.1 18-11-23 下午9:11 cln Exp $$
 */
public class BinarySearch {
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo<hi){
            int mid = (hi+lo)/2;
            // 这里为什么要减一呢?
            // 完美的避免如果是当前值的左边正好是这个值的情况(减少循环),加一也是
            if (key<a[mid]) hi = mid-1;
            else if (key>a[mid]) lo=mid+1;
            else return mid;
        }
        return -1;
    }


}
