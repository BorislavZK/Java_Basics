package Homework.ExamPreparation;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String termOfContract = scan.nextLine();
        String typeOfContract = scan.nextLine();
        String mobileInternet = scan.nextLine();
        int monthsForPayment = Integer.parseInt(scan.nextLine());

        double pricePerMonth = 0;


        switch (typeOfContract) {
            case "Small":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 9.98;
                } else {
                    pricePerMonth = 8.58;
                }
                break;

            case "Middle":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 18.99;
                } else {
                    pricePerMonth = 17.09;
                }
                break;

            case "Large":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 25.98;
                } else {
                    pricePerMonth = 23.59;
                }
                break;

            case "ExtraLarge":
                if (termOfContract.equals("one")) {
                    pricePerMonth = 35.99;
                } else {
                    pricePerMonth = 31.79;
                }
                break;

            default:
                break;

        }

        //•	при добавен мобилен интернет, към таксата за един месец се добавя:
        //o	при такса по-малка или равна на 10.00 лв.  5.50 лв.
        //o	при такса по-малка или равна на 30.00 лв.  4.35 лв.
        //o	при такса по-голяма от 30.00 лв.  3.85 лв.
        //•	ако договорът e за две години, общата сума се намалява с 3.75%

        if ("yes".equals(mobileInternet)) {
            if (pricePerMonth <= 10) {
                pricePerMonth += 5.50;
            } else if (pricePerMonth <= 30) {
                pricePerMonth += 4.35;
            } else {
                pricePerMonth += 3.85;
            }
        }

    }
}
