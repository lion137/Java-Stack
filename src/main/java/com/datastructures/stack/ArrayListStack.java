// Stack Interface implemented as an ArrayList
package com.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {

    private List<T> a = new ArrayList<T>();

    public int size(){
        return a.size();
    }

    public boolean isEmpty(){
        return a.size() == 0;
    }

    public T pop(){
        return a.remove(a.size() - 1);
    }


    public void push(T elem){
        a.add(elem);
    }

    public T peek(){
        return a.get(a.size() - 1);
    }

    @Override public String toString(){
        return a.toString();
    }

}
