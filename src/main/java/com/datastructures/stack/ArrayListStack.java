// Stack Interface implemented as an ArrayList
package com.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {

    private List<T> a = new ArrayList<T>();

    private int N = 0;

    public int size(){
        return a.size();
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public T pop(){
        return a.remove(--N);
    }


    public void push(T elem){
        this.a.add(elem);
        N++;
    }

    public T peek(){
        return a.get(N - 1);
    }

    @Override public String toString(){
        return this.a.toString();
    }

}
