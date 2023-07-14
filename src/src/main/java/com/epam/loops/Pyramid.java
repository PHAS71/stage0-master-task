package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2 - 1; j++) {
                int raw = (cathetusLength - 1) - j;
                int val = raw > 0 ? raw : -raw;
                //if distance from (N/2)-1 [center] < number of symbols in string, write distance, else insert space

                if (val <= i) {
                    System.out.print(val + 1);
                }
                else if (raw > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
