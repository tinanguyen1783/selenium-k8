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
        System.out.println("Please input element number of the array: ");
        arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        System.out.print("Array(random) is : { ");


        //Create element for array with random number.
        for (index = 0; index < arrayLength; index++) {
            array[index] = new SecureRandom().nextInt(100);
            System.out.print(array[index]);
            if (index < (arrayLength - 1)) System.out.print(", ");
            else System.out.println(" }\n");
        }

        min = array[0];
        max = array[0];

        // Find min/max.
        for (int elementValue : array) {

            if (min > elementValue) min = elementValue;
            if (max < elementValue) max = elementValue;

        }

        System.out.println("Min number:" + min);
        System.out.println("Max number:" + max);


    }
}
