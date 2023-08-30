package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        double radius = 0;
        do{
            try {
                System.out.println("Please enter the radius (Positive number)");
                radius = input.nextDouble();
            }
            catch(Exception e){
                System.out.println("You entered a string");
                break;
            }
        }while(radius < 0);

        System.out.println("Area of the circle of " + radius + " is "+ Circle.getArea(radius));
    }
}
