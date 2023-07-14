package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String pane;
        if (x == 0 | y == 0)
            pane = "zero";
        else
        if (x > 0)
            if (y > 0)
                pane = "first";
            else
                pane = "fourth";
        else
        if (y > 0)
            pane = "second";
        else
            pane = "third"  ;
        System.out.println(pane);
    }

}

