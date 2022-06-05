package lab_06;

import java.util.Scanner;
import java.util.List;


public class NumberCollection {
    public static void main(String[] args) {

        StringMethods numberCollect = new StringMethods();
        System.out.println("Please input your string:");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        List<Integer> arrayNum = numberCollect.getNumber(userInput);
        System.out.print("Number:  ");
        for (int i : arrayNum) {

            System.out.print(i);

        }


    }


}
