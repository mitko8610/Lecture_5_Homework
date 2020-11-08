package com.lectures.homework;
import java.util.Scanner;
public class Biggest {
    public static void main(String[] args) {

        System.out.println("Моля въведете първото число: ");
        Scanner firstNumber = new Scanner (System.in);
        int first = firstNumber.nextInt();
        System.out.println("Моля въведете второто число: ");
        Scanner secondNumber = new Scanner (System.in);
        int second = secondNumber.nextInt();
        System.out.println("Моля въведете третото число: ");
        Scanner thirdNumber = new Scanner (System.in);
        int third = thirdNumber.nextInt();

        if (first >= second && third <= first){
            System.out.println("Най голямото въведено число е: " + first);

        }
        else if (second >= first && second >= third){
            System.out.println("Най голямото въведено число е: " + second);
            }
//        else if (first == second || first == third || second == third){
//            System.out.println("Две от въведените числа са равни" + second);
//        }
        else System.out.println("Най голямото въведено число е: " + third);






    }

}