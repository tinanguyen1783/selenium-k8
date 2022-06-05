package lab_06;

public class MinutesCalculation {


    public static void main(String[] args) {

        String string = "2 hrs and 20 minutes ";
        StringMethods minutesCal = new StringMethods();
        System.out.println(string);
        minutesCal.printTotalMinutes(string);

    }

}
