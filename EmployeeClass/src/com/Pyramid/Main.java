package com.Pyramid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the employee name?" );
        String employeeName = input.nextLine();
        System.out.println("What is the Employee Age?");
        int employeeAge = Integer.parseInt(input.nextLine());
        System.out.println("What is the Salary?");
        double employeeSalary = Double.parseDouble(input.nextLine());
        System.out.println("What is the location?");
        String employeeLocation = input.nextLine();
        System.out.println("How many years you have being employed?");
        double employeePeriod = Double.parseDouble(input.nextLine());

        Employees employee = new Employees(employeeName, employeeAge,
                employeeSalary, employeeLocation, employeePeriod);


        System.out.println(employee.getName());
        System.out.println(employeeLocation);
        System.out.println(employeeAge);
        System.out.println(employeePeriod);
        employee.raiseSalary();



    }
}
