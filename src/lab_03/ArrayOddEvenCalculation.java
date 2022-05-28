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

        int arrayLength, odd = 0, even = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element number of the array: ");
        arrayLength = scanner.nextInt();

        int[] array ;

        array = createArray(arrayLength);

        for (int i : array) {
            if (i % 2 == 0) even++;
            else odd++;

        }

        System.out.println("\nEven numbers:" + even);
        System.out.println("Odd numbers:" + odd);


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
