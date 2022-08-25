package Homework.Exercises11;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amount = 0;
        String input = scan.nextLine();

        while (!input.equals("NoMoreMoney")){

            double currentSum = Double.parseDouble(input);
            if ( currentSum < 0 ){
                System.out.println("Invalid operation!");
                break;
            }
            amount += currentSum;
            System.out.printf("Increase: %.2f\n", currentSum);

            input = scan.nextLine();
        }

        System.out.printf("Total: %.2f", amount);
    }
}
