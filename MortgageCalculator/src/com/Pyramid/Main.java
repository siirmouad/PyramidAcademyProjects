package com.Pyramid;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int principal;
        float rate;
        byte years;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("How much is the principal");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000){
                break;
        }
            System.out.println("Please enter a number between 1_000 and 1_000_0000");
        }
        while(true) {
            System.out.print("What is the interest rate?");{
            rate = scanner.nextFloat();
            if (rate > 0 && rate <= 30)
                break;
        }
            System.out.println("Please enter a number between 0 and 30");
        }
        while(true){
                System.out.print("how many years?");{
                years=scanner.nextByte();
                if(years>=1&&years< 30)
        break;
        }
            System.out.println("Please enter a number between 1 and 30");
        }
        float r = (rate/1200);
        int n = years*12;
        double value = Math.pow((1+r),n);
        double top = r*value;
        double bottom = value - 1;
        double mortgage = principal * (top/bottom);
        String Monthly = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + Monthly);


    }
}
