package lab_03;

import java.security.SecureRandom;
import java.util.Scanner;
/*
Merge 2 SORTED integer array into one SORTED array

Array 01: {1, 12, 16, 28, 34}
Array 02: {1, 13, 16, 27, 99}

Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
 */

public class ArrayMergeSort {

    public static void main(String[] args) {

        int i, j, arrayLength1, arrayLength2, tmp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element number of the array 01: ");
        arrayLength1 = scanner.nextInt();

        System.out.println("Please input element number of the array 02: ");
        arrayLength2 = scanner.nextInt();

        int arrayLength3 = arrayLength1 + arrayLength2;
        int[] array1 = new int[arrayLength1];
        int[] array2 = new int[arrayLength2];
        int[] array3 = new int[arrayLength1 + arrayLength2];

        System.out.print("Your array 01 (random) is : ");

        //Create element for array 01 with random number. Add element from array 01 to array 03
        for (i = 0; i < arrayLength1; i++) {
            array1[i] = new SecureRandom().nextInt(100);
            System.out.print(array1[i] + "  ");
            array3[i] = array1[i];

        }

        System.out.print("\nYour array 02 (random) is : ");

        //Create element for array 01 with random number. Add element from array 02 to array 03

        for (i = 0; i < arrayLength2; i++) {
            array2[i] = new SecureRandom().nextInt(100);
            System.out.print(array2[i] + "  ");
            array3[arrayLength1 + i] = array2[i];

        }

        //Sort array 03
        for (i = 0; i < arrayLength3 - 1; i++) {
            for (j = i + 1; j < arrayLength3; j++) {
                if (array3[i] > array3[j]) {
                    tmp = array3[i];
                    array3[i] = array3[j];
                    array3[j] = tmp;
                }
            }

        }

        System.out.println("\nYour array after merging - sorting");

        for (int elementValue : array3) {
            System.out.print(elementValue + "  ");

        }


    }
}
