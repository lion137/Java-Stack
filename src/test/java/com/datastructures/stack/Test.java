package com.datastructures.stack;


import junit.framework.TestCase;


public class Test extends TestCase {


    public void testConstructor() {

        Stack<Integer> st1 = new ArrayListStack<Integer>();
        assertEquals(st1.isEmpty(), true);
        assertEquals(st1.size(), 0);

    }

    public void testException1() {
        try {
            Stack<String> st1 = new ArrayListStack<String>();
            Object test_obj = st1.pop();
            fail("Missing exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("-1", e.getMessage());
        }
    }

    public void testException2(){
        try {
            Stack<String> st1 = new ArrayListStack<String>();
            String test_obj = st1.peek();
            fail( "Missing exception" );
        }
        catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("-1", e.getMessage());
        }

    }

    public void testStack(){
        Stack<String> st1 = new ArrayListStack<String>();
        st1.push("A");
        st1.push("B");
        assertEquals(st1.size(), 2);
        assertEquals(st1.isEmpty(), false);
        assertEquals(st1.peek(), "B");
        assertEquals("[A, B]", st1.toString());
        assertEquals(st1.pop(), "B");
        assertEquals(st1.size(), 1);
        assertEquals("[A]", st1.toString());
    }


}
