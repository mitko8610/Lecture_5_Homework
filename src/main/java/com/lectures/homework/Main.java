package com.lectures.homework;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner dayNumber = new Scanner (System.in);
            String dayName = new String();
            int day = dayNumber.nextInt();

            switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Number of weekday is not valid");

        }
        System.out.println("You entered " + day + ". So week day is " + dayName);

        }

    }