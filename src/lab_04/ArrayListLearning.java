package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLearning {

    public static void main(String[] args) {

        int option;
        boolean isContinue = true;
        List<Integer> arrList;
        arrList = createArrayList();
        Scanner scanner = new Scanner(System.in);

        while (isContinue) {

            System.out.println("\n=====MENU======\n" +
                    "1. Print all numbers\n" +
                    "2. Print maximum value\n" +
                    "3. Print minimum value\n" +
                    "4. Search number");

            System.out.println("\nPlease input your option(1->4)");

            option = scanner.nextInt();

            switch (option) {

                case 1:
                    printArrayList(arrList);
                    break;
                case 2:
                    System.out.println("Max number: " + findMax(arrList));
                    break;
                case 3:
                    System.out.println("Min number: " + findMin(arrList));
                    break;
                case 4:
                    searchNumber(arrList);
                    break;
                default:
                    System.out.println("You have input the option 1- > 4. See you later.");
                    isContinue = false;

            }
        }


    }

    public static List<Integer> createArrayList() {

        int arrayLength, random;
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();

        System.out.println("Please input element number of the ArrayList: ");
        arrayLength = scanner.nextInt();

        System.out.print("ArrayList (random) is created: { ");
        for (int i = 0; i < arrayLength; i++) {
            random = new SecureRandom().nextInt(1000);
            myList.add(i, random);
            System.out.print(myList.get(i));
            if (i < arrayLength - 1) System.out.print(",  ");
            else System.out.print(" }\n");

        }
        return myList;

    }

    public static void printArrayList(List<Integer> myArrList) {

        System.out.print("ArrayList: ");
        for (Integer integer : myArrList) {
            System.out.print(integer + " ");
        }
    }

    public static int findMax(List<Integer> arr) {

        int max;
        max = arr.get(0);
        for (int elementValue : arr) {
            if (max < elementValue) max = elementValue;
        }
        return max;

    }

    public static int findMin(List<Integer> arr) {

        int min;
        min = arr.get(0);
        for (int elementValue : arr) {
            if (min > elementValue) min = elementValue;
        }
        return min;

    }

    public static void searchNumber(List<Integer> arr) {

        Scanner scanner = new Scanner(System.in);
        int numberInput, count = 0;
        System.out.println("Please input the number which you want to search: ");
        numberInput = scanner.nextInt();
        List<Integer> positionList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) == numberInput) {

                positionList.add(count, i);
                count++;

            }

        }

        if (count == 0) System.out.println("Your number doesn't exist in ArrayList");
        else {
            System.out.printf("Your number exists in ArrayList %d time(s) at the index: ", count);
            for (Integer integer : positionList) {
                System.out.print(integer + "  ");

            }
        }


    }


}
