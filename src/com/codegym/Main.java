package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a:");
        a = input.nextInt();
        System.out.println("Enter number b:");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 && b == 0){
            System.out.println("No greatest common factor");
        } else if( a == 0 && b != 0){
            System.out.println("Greatest common factor is " + Math.abs(b));
        } else if(a != 0 && b == 0){
            System.out.println("Greastest common factor is " + Math.abs(a));
        } else {
            while (a != b){
                if(a > b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("The greatest common factor is " + b);
        }
    }
}
