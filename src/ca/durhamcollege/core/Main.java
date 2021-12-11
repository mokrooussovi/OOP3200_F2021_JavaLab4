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
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Bob Green", LocalDate.of(2000,4,6), "34512356", 60000.00);
        System.out.println(salariedEmployee1.toString());
        HourlyWorker hourlyWorker1 = new HourlyWorker("Leo Brown", LocalDate.of(1998, 5,21), "90876980", 21.5, 44.5);
        System.out.println(hourlyWorker1.toString());
    }
}
