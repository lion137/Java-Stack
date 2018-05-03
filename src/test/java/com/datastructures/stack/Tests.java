package com.datastructures.stack;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class Tests {
    static int a;
    static int expected;

    public Tests(int _a, int _expected){
        this.a = _a;
        this.expected = _expected;
    }

    @Parameters(name = "{index}: testSize({0}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, 1},
                {2, 1},
                {1, 1},
        });
    }

    @Test
    public void testPushSize(){
        assertEquals(Main.sizeTest(a), expected);
    }

    @Test
    public void testConstructor() {

        Stack<Integer> st1 = new ArrayListStack<Integer>();
        assertEquals(st1.isEmpty(), true);
        assertEquals(st1.size(), 0);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopEmpty() {
        Stack<Integer> empty_stack = new ArrayListStack<Integer>();
        Object test = empty_stack.pop();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPeekEmpty() {
        Stack<Integer> empty_stack = new ArrayListStack<Integer>();
        Object test = empty_stack.peek();
    }

    @Test
    public void testPushTwoSize(){
        Stack<String> st1 = new ArrayListStack<String>();
        assertEquals(st1.size(), 0);
        st1.push("A");
        st1.push("B");
        assertEquals(st1.size(), 2);
    }

    @Test
    public void testPopSize(){
        Stack<String> st1 = new ArrayListStack<String>();
        st1.push("A");
        st1.push("B");
        st1.pop();
        assertEquals(st1.size(), 1);
        st1.pop();
        assertEquals(st1.size(), 0);
    }

    @Test
    public void testPushTwoIsEmpty(){
        Stack<String> st1 = new ArrayListStack<String>();
        st1.push("A");
        assertEquals(st1.isEmpty(), false);
        st1.push("B");
        assertEquals(st1.isEmpty(), false);
    }

    @Test
    public void testPopIsEmpty(){
        Stack<String> st1 = new ArrayListStack<String>();
        st1.push("A");
        st1.push("B");
        assertEquals(st1.isEmpty(), false);
        st1.pop();
        st1.pop();
        assertEquals(st1.isEmpty(), true);
    }

    @Test
    public void testToStringEmpty(){
        Stack<String> st1 = new ArrayListStack<String>();
        assertEquals(st1.toString(), "[]");

    }

    @Test
    public void testToStringNonEmpty(){
        Stack<String> st1 = new ArrayListStack<String>();
        st1.push("A");
        st1.push("B");
        assertEquals(st1.toString(), "[A, B]");
    }

    @Test
    public void testPushPopManyItems(){
        Stack<Integer> st1 = new ArrayListStack();
        for (long i = 0; i < 300000000; i++){
            boolean test = st1.push(1);
            st1.pop();
            assertEquals(test, true);
        }
    }


}
