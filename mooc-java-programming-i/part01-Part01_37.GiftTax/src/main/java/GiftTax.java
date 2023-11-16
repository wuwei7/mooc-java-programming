
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000) {
            calculateGiftTax(value, 5000, 100, 0.08);
        } else if (value >= 25000 && value < 55000) {
            calculateGiftTax(value, 25000, 1700, 0.1);
        } else if (value >= 55000 && value < 200000) {
            calculateGiftTax(value, 55000, 4700, 0.12);
        } else if (value >= 200000 && value < 1000000) {
            calculateGiftTax(value, 200000, 22100, 0.15);
        } else {
            calculateGiftTax(value, 1000000, 142100, 0.17);
        }

    }
    
    public static void calculateGiftTax(double valueOfGift, int lowerLimit, int taxAtLowerLimit, double taxRate) {
        double tax = (taxAtLowerLimit + (valueOfGift - lowerLimit) * taxRate);
        System.out.println("Tax: " + tax);
    }
}
