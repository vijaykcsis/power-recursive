package com.power;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Scanner scan = new Scanner(System.in);
        Character command = '_';
        /*
        // This while loop runs until the user quits
        // This snippet of code is adapted from the
        // ChavviCalc assignment I submitted earlier  
        // in the semester.
        while (command != 'q') {
            printMenu();
            System.out.print("Enter a command: ");
            command = menuGetCommand(scan);
            executeCommand(scan, command, commandArray);
        }
        scan.close();
        */
        System.out.println(power(2, 10));
    }

    public static float power(float x, int n) {

        if (n == 0) {
            return 1.0f;
        }
        if (n == 1) {
            return x;
        }

        float result = x*power(x, n-1);
        System.out.println("DEBUG PRINT: RESULT, X, N: " + String.valueOf(result) + ", " + String.valueOf(x) + ", " + String.valueOf(n));
        return result;
    }
}
