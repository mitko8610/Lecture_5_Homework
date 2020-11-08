package com.lectures.homework;
import java.util.Scanner;
public class Biggest {
    public static void main(String[] args) {

        Scanner firstNumber = new Scanner (System.in);
        Scanner secondNumber = new Scanner (System.in);
        Scanner thirdNumber = new Scanner (System.in);


        int first = firstNumber.nextInt();
        int second = secondNumber.nextInt();
        int third = thirdNumber.nextInt();

        if (first > second && third < first){
            System.out.println("Най голямото въведено число е: " + first);

        }
        else if (second > first && second > third){
            System.out.println("Най голямото въведено число е: " + second);
        }
        else System.out.println("Най голямото въведено число е: " + third);






    }

}