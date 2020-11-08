package com.lectures.homework;
import java.util.Scanner;
public class IsPositive {
    public static void main(String[] args) {

        Scanner someNumber = new Scanner (System.in);
        int number = someNumber.nextInt();
        if (number < 0){
            System.out.println("The number you entered is NEGATIVE");
        }
            else{
                System.out.println("The number you entered is Positive");
        }




    }

}