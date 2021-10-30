package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// String examples
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the long number:");
        int input = scanner.nextInt();

        int hours = input/3600000;
        input = input%3600000;

        int minutes = input/60000;
        input = input%60000;

        int seconds = input/1000;

        int milliseconds = input%1000;

        System.out.println(hours+"hrs:"+minutes+"min:"+seconds+"sec:"+milliseconds+"milliseconds");

    }
}
