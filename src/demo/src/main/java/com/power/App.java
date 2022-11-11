package com.power;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {    
        Scanner scan = new Scanner(System.in); 
        char cont;
        do {
            cont = '_';
            System.out.print("Please enter a value for x: ");
            float x = Float.parseFloat(scan.nextLine());
    
            System.out.print("Please enter a value for n: ");
            int n = Integer.parseInt(scan.nextLine());

            System.out.print("The value of x^n is... ");
            System.out.println(power(x, n));
            
            while ((cont != 'y') && (cont != 'n')) { // Input validation
                System.out.print("Would you like to continue using the program? ('y' = yes, 'n' = no): ");
                // This snippet of code that reads the user input is 
                // from the chavvicalc assignment that I submitted 
                // earlier in the semester
                cont = menuGetCommand(scan);
                if ((cont != 'y') && (cont != 'n')) {
                    System.out.println("ERROR: Invalid command");
                }
            }
            if (cont == 'n') {
                System.out.println("Quitting...");
            }
        } while (cont == 'y');
        scan.close();
        System.out.println("Thank you for using the program.");
    }

    private static Character menuGetCommand(Scanner scan) {
        Character command = '_';
        String rawInput = scan.nextLine();

        if (rawInput.length() > 0) {
            rawInput = rawInput.toLowerCase();
            command = rawInput.charAt(0);
        }
        return command;
    }

    public static float power(float x, int n) {
        if ((n == 0 && x == 0f) || (n < 0)) {
            System.out.println("ERROR: Undefined, returning -1.");
            return -1;
        }
        else if (n == 0) {
            return 1.0f;
        }
        else if (n == 1) {
            return x;
        }

        float result = x*power(x, n-1);
        return result;
    }
}