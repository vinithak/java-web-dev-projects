package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven: ");
        float miles = input.nextFloat();
        System.out.println("Please enter the amount of gas consumed (gallons): ");
        float gallons = input.nextFloat();
        System.out.println("Miles per Gallon: " + (miles / gallons));
    }
}
