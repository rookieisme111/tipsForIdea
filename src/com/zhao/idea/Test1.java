package com.zhao.idea;

import java.util.ArrayList;

/**
 * @author: zxh
 * @time: 2022/9/19 - 19:57
 */
public class Test1 {

    private static final String A = "123";
    public static final int a = 1;

    public static void main(String[] args) {
        foo();
        boolean isEmpty = true;
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        System.out.println(arrayList.toArray());
    }

    private static void foo() {
        ArrayList<Object> arrayList = new ArrayList<>();
        new ArrayList<>();
    }
}
