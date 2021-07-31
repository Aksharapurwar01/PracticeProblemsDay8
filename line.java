package com.company;

import java.lang.Math;
import java.util.Scanner;



public class line {


    public static double calculateLength(int x1, int x2, int y1, int y2) {

        double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;

    }

    public static void equalNCompareLengths() {

        int x1,y1,x2,y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point");
        x1 = sc.nextInt();
        System.out.println("Enter x2 point");
        x2= sc.nextInt();
        System.out.println("Enter y1 point");
        y1 = sc.nextInt();
        System.out.println("Enter y2 point");
        y2 = sc.nextInt();


        Double length1=calculateLength(x1,x2,y1,y2);

        String s1=String.valueOf(length1);
        System.out.println(s1);




        int a=2;
        int b=6;

        int a1=6;
        int b1=10;

        Double length2=calculateLength(a,b,a1,b1);


        String s2=String.valueOf(length2);
        System.out.println(s2);

        if(s1.equals(s2)) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("not equal");
        }



        int compareValue = length1.compareTo(length2);

        if (compareValue == 0) {
            System.out.println("lengths are equal");
        }
        else if (compareValue < 0) {
            System.out.println("Length 2 is greater than Length 1");
        }
        else {
            System.out.println("Length 1 is greater tha length 2");
        }




    }
    public static void main(String[] args) {

        equalNCompareLengths();

    }
}
