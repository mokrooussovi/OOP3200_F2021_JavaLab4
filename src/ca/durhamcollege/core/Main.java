/**
 * @JavaLab4
 * @author Ivan Mokrooussov, Tyler Henry
 * @IvanStudentID: 100808605
 * @TylerStudentID: 10053023
 * @date: December 6, 2021
 * @description:  Abstract Classes and Polymorphism
 */

package ca.durhamcollege.core;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Reece James", LocalDate.of(2000,4,6), "34512356", 60000.00);
        System.out.println(salariedEmployee1.toString());
        System.out.printf("The employee's week salary is %.2f dollars. \n", salariedEmployee1.CalculatePayDay());
        System.out.println("*********************************************** \n");
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Bruno Fernandes", LocalDate.of(1996, 7,23), "56745690", 82300.00);
        System.out.println(salariedEmployee2.toString());
        System.out.printf("The employee's week salary is %.2f dollars. \n", salariedEmployee2.CalculatePayDay());
        System.out.println("*********************************************** \n");

        HourlyWorker hourlyWorker1 = new HourlyWorker("Mason Mount", LocalDate.of(1998, 5,21), "90876980", 21.5, 44.5);
        System.out.println(hourlyWorker1.toString());
        System.out.printf("The hourly worker's week salary is %.2f dollars. \n", hourlyWorker1.CalculatePayDay());
        System.out.println("*************************************************** \n");
        HourlyWorker hourlyWorker2 = new HourlyWorker("Jesse Lingard", LocalDate.of(1997, 2,27), "67450981", 33.5, 47.0);
        System.out.println(hourlyWorker2.toString());
        System.out.printf("The hourly worker's week salary is %.2f dollars. \n", hourlyWorker2.CalculatePayDay());
        System.out.println("*************************************************** \n");
    }
}
