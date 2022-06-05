package lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class StringMethods {

    public void printTotalMinutes(String str) {

        String[] arraystr;
        arraystr = str.split(" and ");

        arraystr[0] = arraystr[0].replaceAll("[^0-9.]", "");
        arraystr[1] = arraystr[1].replaceAll("[^0-9.]", "");

        int total = (Integer.valueOf(arraystr[0]) * 60) + Integer.valueOf(arraystr[1]);

        System.out.println("The minutes in total are " + total);

    }

    public String getPasswordInput() {

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public List<Integer> getNumber(String str) {

        char[] arraystr = str.toCharArray();
        List<Integer> arrayNum = new ArrayList<>();

        int i = 0;
        for (char c : arraystr) {

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
