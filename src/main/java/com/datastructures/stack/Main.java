package com.datastructures.stack;

public class Main {
    public static int sizeTest(int a){
        Stack<Integer> st1 = new ArrayListStack<Integer>();
        st1.push(a);
        return st1.size();
    }
}
