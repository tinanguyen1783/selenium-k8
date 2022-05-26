package lab_03;

import java.security.SecureRandom;
import java.util.Scanner;

/*
Sort an integer array from min to max

Input: {12, 34, 1, 16, 28}
Expected output: {1, 12, 16, 28, 34}
*/

public class ArraySortInc {

    public static void main(String[] args) {

        int i, j, arrayLength, tmp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element number of the array: ");
        arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        System.out.print("Array(random) is: { ");

        //Create element for array with random number.
        for (i = 0; i < arrayLength; i++) {
            array[i] = new SecureRandom().nextInt(100);
            System.out.print(array[i]);
            if (i < (arrayLength - 1)) System.out.print(", ");
            else System.out.println(" }\n");
        }

        //Sort array.
        for (i = 0; i < arrayLength - 1; i++) {
            for (j = i + 1; j < arrayLength; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }

        }

        System.out.print("\nYour array after sorting: ");

        for (int elementValue : array) {
            System.out.print(elementValue + " ");

        }


    }
}
