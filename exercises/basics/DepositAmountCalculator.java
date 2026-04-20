//The bank accrues 7% interest on the deposit amount each month. Write a console program in
//which the user enters the deposit amount and the number of months. The bank then calculates
//the final deposit amount, taking into account the interest accrued each month.
//
//To calculate the amount, including interest, use a for loop. Let the deposit amount be a float.


package basics;

import java.util.Scanner;

public class DepositAmountCalculator {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sum of deposit: ");
        float customerSum = input.nextFloat();

        System.out.print("Enter deposit duration in months: ");
        int customerData = input.nextInt();

        final int PROCENT = 7;


        for (int i = 1; i <= customerData; i++) {
            customerSum += customerSum * PROCENT / 100;

        }

        System.out.printf("Total sum: %.2f\n", customerSum);
        input.close();
    }
}
