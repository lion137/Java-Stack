// Generic Stack Interface
package com.datastructures.stack;


public interface Stack<T> {

    int size();

    boolean isEmpty();

    T pop();

    void push(T elem);

     T peek();



}

