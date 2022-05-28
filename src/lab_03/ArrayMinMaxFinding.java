package lab_03;

import java.security.SecureRandom;
import java.util.Scanner;

/*
Finding maximum value/minimum value from an integer array

int[] intArr = {1, 2, 3, 4, 5};

Minimum: 1
Maximum: 5
*/
public class ArrayMinMaxFinding {

    public static void main(String[] args) {

        int index, arrayLength, min, max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element number of the array that you want to create: ");
        arrayLength = scanner.nextInt();

        int[] array;
        array = createArray(arrayLength);

        System.out.println("Min number: " + findMin(array));
        System.out.println("Max number: " + findMax(array));


    }

    public static int findMax(int[] arr) {
        int max;
        max = arr[0];
        for (int elementValue : arr) {
            if (max < elementValue) max = elementValue;
        }
        return max;

    }

    public static int findMin(int[] arr) {
        int min;
        min = arr[0];
        for (int elementValue : arr) {
            if (min > elementValue) min = elementValue;
        }
        return min;

    }

    public static int[] createArray(int num) {
        int[] array = new int[num];

        System.out.print("Array(random) is : { ");
        for (int i = 0; i < num; i++) {
            array[i] = new SecureRandom().nextInt(100);
            System.out.print(array[i]);
            if (i < num - 1) System.out.print(",  ");
            else System.out.print(" }\n");

        }
        return array;

    }
}
