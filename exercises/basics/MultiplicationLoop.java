//In a loop, the program asks the user to enter two numbers and displays the result of their multiplication.
//After displaying the result of the multiplication, the program asks whether to terminate.
//If the user enters 1, the program terminates the loop. If any other number is entered,
//the program continues asking the user for two numbers and multiplying them.


package basics;

import java.util.Scanner;

public class MultiplicationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        while (choice != 1) {
            System.out.print("Enter first num: ");
            int num1 = input.nextInt();

            System.out.print("Enter second num: ");
            int num2 = input.nextInt();

            System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);

            System.out.print("End? (1 = YES, any other number = NO): ");
            choice = input.nextInt();
        }
        input.close();
    }
}
