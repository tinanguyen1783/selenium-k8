package lab_02;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float heightUser, weightUser, bmi;

        System.out.println("Please input your height(m)");
        heightUser = scanner.nextFloat();

        System.out.println("Please input your weight (kg)");
        weightUser = scanner.nextFloat();

        bmi = weightUser / (heightUser * heightUser);
        System.out.println("Your BMI is " + String.format("%.2f", bmi));

//        Underweight = <18.5
//        Normal weight = 18.5 – 24.9
//        Overweight = 25–29.9
//        Obesity = BMI of 30 or greater


        float weightChange;
        if (bmi < 18.5) {
            weightChange = (float) (18.5 * (heightUser * heightUser)) - weightUser;
            System.out.println("Underweight. You should increase " + weightChange + "(kg)");
        } else if (bmi <= 24.9) System.out.println("Normal weight.");
        else {
            weightChange = weightUser - (float) (24.9 * (heightUser * heightUser));
            if (bmi <= 29.9) System.out.println("Overweight");
            else System.out.println("Obesity");
            System.out.println("You should decrease " + String.format("%.2f", weightChange) + "(kg)");

        }

    }

}






