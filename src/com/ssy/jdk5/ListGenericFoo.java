package com.ssy.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGenericFoo<T extends List> {

    private T[] fooArray;

    public T[] getFooArray() {
        return fooArray;
    }

    public void setFooArray(T[] fooArray) {
        this.fooArray = fooArray;
    }

    public static void main(String[] args) {
        ListGenericFoo<LinkedList> foo1 = new ListGenericFoo<>();
        ListGenericFoo<ArrayList> foo2 = new ListGenericFoo<>();

        LinkedList[] linkedLists = new LinkedList[10];

        foo1.setFooArray(linkedLists);

        ArrayList[] arrayLists = new ArrayList[10];

        foo2.setFooArray(arrayLists);




    }
}
