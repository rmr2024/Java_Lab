package datatypedemo;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		int n = 5; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) 
        { // Outer loop for rows
            // Loop for printing spaces
            for (int j = 1; j <= n- i; j++) 
            {
                System.out.print(" ");
            }

            // Loop for printing stars
            for (int k = 1; k <= 2 * i - 1; k++) 
            {
                System.out.print("*");
            }
        
            System.out.println(); // Move to the next line
        }

        for (int i = n; i >= 1; i--) 
        { // Outer loop for rows
            // Loop for printing leading spaces
            for (int j = 0; j <= n-i; j++) 
            {
                System.out.print(" ");
            }

            // Loop for printing stars
            for (int k = 3; k <= 2 * i - 1; k++) 
            {
                System.out.print("*");
            }
            System.out.println();

        }

	}

}
