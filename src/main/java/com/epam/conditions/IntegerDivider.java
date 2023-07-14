package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0)
            System.out.print("division by zero\n");
        else {
            int result = dividend / divider;
            if (result * divider == dividend)
                System.out.print("can be divided completely\n");
            else
                System.out.print("cannot be divided completely\n");
        }
    }

}
