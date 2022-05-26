package lab_03;

/*
Merge 2 SORTED integer array into one SORTED array

Array 01: {1, 12, 16, 28, 34}
Array 02: {1, 13, 16, 27, 99}

Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
 */

public class ArrayMergeSortInc {

    public static void main(String[] args) {

        int i, j, arrayLength1, arrayLength2, arrayLength3, tmp;

        int[] array1 = { 1, 12, 16, 28, 34,9,90 };
        int[] array2 = { 1, 13, 16, 27, 99 };

        arrayLength1 = array1.length;
        arrayLength2 = array2.length;
        arrayLength3 = array1.length + array2.length;

        int[] array3 = new int[arrayLength3];

        System.out.print("\nArray 01 is : ");
        // Add element from array 01 to array 03
        for (i = 0; i < arrayLength1; i++) {
            System.out.print(array1[i] + "  ");
            array3[i] = array1[i];

        }

        System.out.print("\nArray 02 is : ");

        //Add element from array 02 to array 03

        for (i = 0; i < arrayLength2; i++) {
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

        System.out.println("\nArray after merging - sorting");

        for (int elementValue : array3) {
            System.out.print(elementValue + "  ");

        }


    }
}
