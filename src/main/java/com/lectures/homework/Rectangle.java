package com.lectures.homework;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

        Scanner rectHeight = new Scanner (System.in);
        Scanner rectWidth = new Scanner (System.in);
        int height = rectHeight.nextInt();
        int width = rectWidth.nextInt();
        int rectArea = height*width;
        int rectPerimeter = height*2+width*2;




        System.out.println("Лицето на правоъгълник със страни:" + height + " и " + width + " e: " + rectArea);
        System.out.println("Периметърът на правоъгълник със страни:" + width + "и " + height + "e: " + rectPerimeter);

    }

}