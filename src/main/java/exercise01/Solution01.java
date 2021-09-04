/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package exercise01;

import java.util.Scanner;

/*
* this is the pseudocode for assignment 1
* Create a program that prompts for your name and prints a greeting using your name.
*       -prompt user for their name
*       -store name in variable
*       -print out greeting statement including new name variable
 */

//this is the application
public class Solution01 {
    public static void main(String[] args)
    {
        System.out.print("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + ", nice to meet you!");
    }

}
