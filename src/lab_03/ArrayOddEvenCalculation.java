package lab_03;

import java.security.SecureRandom;
import java.util.Scanner;

/*
Count how many odd, even number(s) in an integer array

int[] intArr = {1, 2, 3, 4, 5};

Even numders: 2
Odd numbers: 3
 */
public class ArrayOddEvenCalculation {

    public static void main(String[] args) {

        int index, arrayLength, odd = 0, even = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element number of the array: ");
        arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        System.out.print("Array(random) is: {");

        //Create element for array with random number. Count odd and even.
        for (index = 0; index < arrayLength; index++) {

            array[index] = new SecureRandom().nextInt(100);
            System.out.print(array[index]);
            if (index < (arrayLength - 1)) System.out.print(", ");
            else System.out.println(" }\n");

            if (array[index] % 2 == 0) even++;
            else odd++;

        }

        System.out.println("\nEven numbers:" + even);
        System.out.println("Odd numbers:" + odd);


    }
}
