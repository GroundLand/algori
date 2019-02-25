package com.algori.chapterThird;

/**
 * @author cl
 * @version $Id: MyBST v 0.1 2019-01-14 19:10 cl Exp $$
 */
public class MyBST<K extends Comparable<K>, V> {

    private Node root;

    private class Node {
        private K key;
        private V value;
        private Node left, right;
        private int N;

        public Node(K key, V value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }


    public int size() {
        return this.size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    public V get(K key) {
        return get(root, key);
    }

    /**
     * 根据key获取一个元素
     *
     * @param x
     * @param key
     * @return
     */
    private V get(Node x, K key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        if (cmp > 0) return get(x.right, key);
        else return x.value;
    }

    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private Node put(Node x, K key, V value) {
        if (x == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return put(x.left, key, value);
        if (cmp > 0) return put(x.right, key, value);
        x.value = value;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * 获取最小值
     * @param x
     * @return
     */
    private Node min(Node x){
        if(x.left == null) return x;
        return min(x.left);
    }


    /**
     * 获取最大值
     * @param x
     * @return
     */
    private Node max(Node x){
        if (x.right == null) return x;
        return max(x.right);
    }



}
