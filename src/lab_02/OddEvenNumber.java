package lab_02;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numberInput ;

        System.out.println("Please input a number.");
        try {
            numberInput = scanner.nextFloat();
            if (numberInput % 2 == 0) System.out.println("This is even number");
            else System.out.println("This is odd number");
        } catch (Exception e) {
            System.out.println("You should input a number.");
        }

    }
}
