package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLearning {

    public static void main(String[] args) {

        int arrayLength, option;

        List<Integer> arrList ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input element number of the ArrayList: ");
        arrayLength = scanner.nextInt();

        arrList = createArrayList(arrayLength);

        System.out.println("=====MENU======\n" +
                "1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number");
        System.out.println("Please input your option(1->4)");
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
                System.out.println("You have input the number 1- > 4");

        }


    }

    public static List<Integer> createArrayList(int num) {

        List<Integer> myList = new ArrayList<>();
        int random;
        System.out.print("ArrayList (random) is created: { ");
        for (int i = 0; i < num; i++) {
            random = new SecureRandom().nextInt(10);
            myList.add(i, random);
            System.out.print(myList.get(i));
            if (i < num - 1) System.out.print(",  ");
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

        Scanner scaner = new Scanner(System.in);
        int number;
        System.out.println("Please input the number which you want to search: ");
        number = scaner.nextInt();
        int count = 0;
        List<Integer> positionList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == number) {
                positionList.add(count, i);
                count++;
            }

        }
        if (count == 0) System.out.println("Your number doesn't exist in ArrayList");
        else {
            System.out.print("Your number exists in ArrayList at the index: ");
            for (Integer integer : positionList) {
                System.out.print(integer + "  ");

            }
        }


    }


}
