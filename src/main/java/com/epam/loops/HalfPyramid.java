package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i < cathetusLength + 1; i++) {
            for (int j = 0; j < cathetusLength - i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
