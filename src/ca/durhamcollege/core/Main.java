/**
 * @JavaLab4
 * @author Ivan Mokrooussov, Tyler Henry
 * @IvanStudentID: 100808605
 * @TylerStudentID: 10053023
 * @date: December 6, 2021
 * @update: December 11, 2021
 * @description:  Abstract Classes and Polymorphism
 */

package ca.durhamcollege.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        // Part 1 of testing and program requirements
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Reece James", LocalDate.of(2000,4,6), "34512356", 60000.00);
        System.out.println(salariedEmployee1.toString());
        System.out.printf("The employee's week salary is %.2f dollars. \n", salariedEmployee1.CalculatePayDay());
        System.out.println("*********************************************** \n");
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Bruno Fernandes", LocalDate.of(1996, 7,23), "56745690", 82300.00);
        System.out.println(salariedEmployee2.toString());
        System.out.printf("The employee's week salary is %.2f dollars. \n", salariedEmployee2.CalculatePayDay());
        System.out.println("*********************************************** \n");

        // Part 2 of testing and program requirements
        HourlyWorker hourlyWorker1 = new HourlyWorker("Mason Mount", LocalDate.of(1998, 5,21), "90876980", 21.5, 44.5);
        System.out.println(hourlyWorker1.toString());
        System.out.printf("The hourly worker's week salary is %.2f dollars. \n", hourlyWorker1.CalculatePayDay());
        System.out.println("*************************************************** \n");
        HourlyWorker hourlyWorker2 = new HourlyWorker("Jesse Lingard", LocalDate.of(1997, 2,27), "67450981", 33.5, 47.0);
        System.out.println(hourlyWorker2.toString());
        System.out.printf("The hourly worker's week salary is %.2f dollars. \n", hourlyWorker2.CalculatePayDay());
        System.out.println("*************************************************** \n");

        // Part 3 of testing and program requirements
        ArrayList<Employee> arrayOfEmployees = new ArrayList<>();
        try
        {
            SalariedEmployee salariedEmployee3 = new SalariedEmployee("Jack Grealish", LocalDate.of(2001,8,7), "23099089", 125000.00);
            arrayOfEmployees.addAll(Arrays.asList(salariedEmployee3));
            SalariedEmployee salariedEmployee4 = new SalariedEmployee("Cristian Pulisic", LocalDate.of(1999, 1,27), "68943210", 97000.00);
            arrayOfEmployees.addAll(Arrays.asList(salariedEmployee4));
            HourlyWorker hourlyWorker3 = new HourlyWorker("Harry Kane", LocalDate.of(1997, 5, 12), "24310989", 45.0, 47.0);
            arrayOfEmployees.addAll(Arrays.asList(hourlyWorker3));
            HourlyWorker hourlyWorker4 = new HourlyWorker("Marcus Rashford", LocalDate.of(1993, 10, 5), "12389021", 39.5, 43.5);
            arrayOfEmployees.addAll(Arrays.asList(hourlyWorker4));
            HourlyWorker hourlyWorker5 = new HourlyWorker("Phil Foden", LocalDate.of(2001, 6, 15), "67845320", 32.5, 42.5);
            arrayOfEmployees.addAll(Arrays.asList(hourlyWorker5));
        }
        catch (IllegalArgumentException illegalArgumentException)
        {
            System.out.println("The user's input data are invalid.");
        }

        // Part 4 of testing and program requirements
        double totalWeeklyPay = 0.0;
        for (var employee: arrayOfEmployees)
        {
            System.out.println(employee);
            System.out.printf("The hourly worker's week salary is %.2f dollars. \n", employee.CalculatePayDay());
            totalWeeklyPay += employee.CalculatePayDay();
            System.out.println("*************************************************** \n");
        }
        System.out.printf("The total amount paid to all employees this week in section #4 is %.2f dollars.", totalWeeklyPay);
    }
}
