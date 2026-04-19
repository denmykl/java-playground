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

    }
}
