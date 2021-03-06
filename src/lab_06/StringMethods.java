package lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class StringMethods {

    public void printTotalMinutes(String str) {

        String[] arrayStr;
        arrayStr = str.split(" and ");

        arrayStr[0] = arrayStr[0].replaceAll("[^0-9.]", "");
        arrayStr[1] = arrayStr[1].replaceAll("[^0-9.]", "");

        int total = (Integer.valueOf(arrayStr[0]) * 60) + Integer.valueOf(arrayStr[1]);

        System.out.println("The minutes in total are " + total);

    }

    public void checkPassword(String password) {

        Scanner scanner = new Scanner(System.in);

        String passdUserInput;
        System.out.println("Please input your password.");
        int time = 3;
        while (time > 0) {
            passdUserInput = scanner.next();
            if (passdUserInput.equals(password)) {
                System.out.println("Login successful. ");
                return;
            }
            time--;
            if (time != 0) System.out.println("Please re-input your password.");

        }

        if (time == 0) System.out.println("Your account is blocked.");
        return;

    }

    public List<Integer> getNumber(String str) {

        char[] arrayStr = str.toCharArray();
        List<Integer> arrayNum = new ArrayList<>();

        int i = 0;
        for (char c : arrayStr) {

            if (Character.isDigit(c)) arrayNum.add(getNumericValue(c));

        }

        return arrayNum;

    }

    public void checkUrl(String url) {

        String[] arrayUrl = url.split("://");
        String domainName = arrayUrl[1].substring(0, arrayUrl[1].length() - 4);
        String suffixes = arrayUrl[1].substring(arrayUrl[1].length() - 4, arrayUrl[1].length());

        System.out.println("Url String: " + url);
        System.out.println("Protocol: " + arrayUrl[0]);
        System.out.println("Domain name: " + domainName);
        System.out.println("Suffixes: " + suffixes);


    }

    public static void main(String[] args) {

    }
}
