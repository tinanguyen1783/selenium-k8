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

        int[] array;

        array = createArray(arrayLength);

        array = sortInc(array);
        System.out.print("\nYour array after sorting: ");

        for (int elementValue : array) {
            System.out.print(elementValue + " ");

        }


    }

    public static int[] createArray(int num) {

        System.out.print("Array(random) is: { ");
        int[] array = new int[num];
        //Create element for array with random number.
        for (int i = 0; i < num; i++) {
            array[i] = new SecureRandom().nextInt(100);
            System.out.print(array[i]);
            if (i < (num - 1)) System.out.print(", ");
            else System.out.println(" }\n");
        }
        return array;

    }

    public static int[] sortInc(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        return arr;
    }

}
