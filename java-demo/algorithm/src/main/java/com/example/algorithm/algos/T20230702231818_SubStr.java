package com.example.algorithm.algos;

/**
 * 给定一个string数组p及其大小n,同时给定长字符串string s,请返回一个bool数组，
 * 元素为true或false对应p中的对应字符串是否为s的子串。要求p中的串长度小于等于
 * 8,且p中的串的个数小于等于500，同时要求s的长度小于等于1000。
 */
public class T20230702231818_SubStr {

    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] hr = new boolean[p.length];
        if (p.length > 500 || s.length() > 1000) {
            return hr;
        }
        for (int i = 0; i < n; i++) {
            hr[i] = s.contains(p[i]);
        }
        return hr;
    }

    public static void main(String[] args) {
        String[] p = {"a", "b", "c", "d"};
        int n = 4;
        String s="abc";
        boolean[] hr = chkSubStr(p,n,s);
        System.out.println(hr);
    }
}
