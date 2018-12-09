package com.algori.chapterOne.forth;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.ThreeSum;

/**
 * @author cl
 * @version $Id: StopwatchTest.java v 0.1 18-12-9 下午6:57 cl Exp $$
 */
public class StopwatchTest {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-1000000, 1000000);
        }

        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapsedTime();
        // 1000  52 triples 0.293
        // 2000  512 triples 1.684
        StdOut.println(cnt + " triples " + time);
    }
}
