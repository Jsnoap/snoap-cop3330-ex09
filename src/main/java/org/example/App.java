/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Program that takes length and width of a wall in feet and prints how many gallons of pain are needed to cover that wall
    // Given: 1 gallon of paint covers 350 square feet.
    public static void main( String[] args )
    {
        int length, width, area, paintGallons;

        System.out.println("What is the length of your wall in feet?");
        Scanner inputLen = new Scanner(System.in);
        length = inputLen.nextInt();

        System.out.println("What is the width of your wall in feet?");
        Scanner inputWidth = new Scanner(System.in);
        width = inputWidth.nextInt();

        area = length * width;

        paintGallons = area / 350;

        if ((area % 350) != 0)
        {
            paintGallons++;
        }

        System.out.println("You will need to purchase " + paintGallons + " gallons of paint to cover " + area + " square feet.");

    }
}
