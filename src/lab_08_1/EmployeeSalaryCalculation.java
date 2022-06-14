package lab_08_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSalaryCalculation {

    public int salaryCalculation(List<Employee> employeeList) {

        int totalSalary = 0;
        for (Employee e : employeeList) {
            totalSalary += e.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {

        int totalFullTimeEmployee, totalPartTimeEmployee;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the total full-time employee: ");
        totalFullTimeEmployee = scanner.nextInt();

        System.out.print("Please input the total part-time employee: ");
        totalPartTimeEmployee = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();


        for (int i = 0; i < totalFullTimeEmployee; i++) {
            Employee fullTimeEmployee = new FulltimeEmployee();
            employees.add(fullTimeEmployee);
        }

        for (int j = 0; j < totalPartTimeEmployee; j++) {
            Employee partTimeEmployee = new ParttimeEmployee();
            employees.add(partTimeEmployee);
        }

        System.out.println(" Total Salary: " + new EmployeeSalaryCalculation().salaryCalculation(employees));

    }

}
