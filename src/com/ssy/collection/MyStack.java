package com.ssy.collection;

import java.util.LinkedList;

public class MyStack {

    private LinkedList list = new LinkedList();

    public void push(Object o) {
        list.addLast(o);
    }

    public Object pop() {
        return list.removeLast();
    }

    public Object peek() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("one");
        myStack.push("two");
        myStack.push("three");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.isEmpty());
    }
}
