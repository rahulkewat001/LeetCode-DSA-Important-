package TCSNQT;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int discount = 0;

        if(amount < 1000) {
            discount = (amount * 5) / 100;
        } else if (amount >= 1000 && amount < 5000) {
            discount = (amount * 10) / 100;
        } else if (amount >= 5000) {
            discount = (amount * 15) / 100;
        }

        double finalAmount = amount - discount;
        System.out.println("Discount :" + discount);
        System.out.printf("%.2f", finalAmount);

    }
}
