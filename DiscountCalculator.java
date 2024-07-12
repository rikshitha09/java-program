/*An ecommerce company plans to give their customers a discount for the new year. the discount will be calculated on the basis of the bill amount is the product of the sum of all odd digits and the sum of even digits of the customer's total bill. if no odd-even digit is represented in the bill amount then 0 will be returned?*/

import java.util.Scanner;

public class DiscountCalculator {
    public static int calculateDiscount(String billAmount) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < billAmount.length(); i++) {
            char digitChar = billAmount.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
        }

        if (sumOdd == 0 && sumEven == 0) {
            return 0; // No odd or even digits found
        }

        return sumOdd * sumEven; // Calculate discount based on the formula provided
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        String billAmount = scanner.next();

        int discount = calculateDiscount(billAmount);
        System.out.println("Discount: " + discount);
    }
}



