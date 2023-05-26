package com.bridgelabz;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int rollNo1 = 12;
        int rollNo2 = 13;
        int[] rollNo = {12, 13, 14, 15};
        myArray[0] = 12;
        myArray[1] = 13;
        myArray[2] = 14;
        myArray[3] = 15;
        myArray[4] = 16;

        System.out.println(myArray[0]);
        System.out.println(myArray[4]);
        System.out.println(myArray[myArray.length - 1]);
        System.out.println(Arrays.toString(myArray));

        for (int a : myArray) {
            System.out.println(a);
            {
                if (a % 2 == 0) {
                    System.out.println(a);
                }
            }

            int count = 0;
            for (int i = 0; i <= myArray.length - 1; i++) {
                if (i % 2 == 0) {
                    count++;
                }


            }
            System.out.println("total even number :" + count);
        }
    }}

