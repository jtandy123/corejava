package com.ssy.collection;

import java.util.ArrayList;

/**
 * @author tao.jiang
 */

public class ArrayListTest5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Point(2, 3));
        list.add(new Point(2, 2));
        list.add(new Point(4, 4));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}

class Point {
    int x;
    int y;

    /**
     *
     * @param x coordinate of aix of x
     * @param y coordinate of aix of y
     */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return return coordinate of aix of x and y
     */
    @Override
    public String toString() {
        return "x=" + this.x + ", y=" +  this.y;
    }
}
