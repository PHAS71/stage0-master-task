package com.epam.langSyntax;

public class NumberReverter {

    public void revert (int number) {
        int ans = number % 10 * 100 + number / 100 + number % 100 / 10 * 10;
        System.out.println(ans);
    }

}
