package ca.durhamcollege.core;

import ca.durhamcollege.utility.Config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class SalariedEmployee extends Employee
{
    // Instance variable
    private Double myYearlySalary;

    // Parameterized Constructor
    /**
     * Initializes a person object based on parameters for SalariedEmployee class.
     *
     * @param fullName   - the intended full name, in order, separated by spaces.
     * @param birthDate  - the intended birth date.
     * @param employeeID -the intended the employee 8-digit number ID.
     * @param yearlySalary - the intended the Yearly Salary for the employee.
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */
    public SalariedEmployee(String fullName, LocalDate birthDate, String employeeID, final double yearlySalary)
    {
        super(fullName, birthDate, employeeID);
        this.setYearlySalary(yearlySalary);
    }

    // Accessors and Mutators

    /**
     * Setter for attribute myYearlySalary for SalariedEmployee class
     * @param yearlySalary
     */
    final public void setYearlySalary(double yearlySalary)
    {
        if(yearlySalary >= Config.ZERO_SALARY)
        {
            myYearlySalary = yearlySalary;
            //myYearlySalary = new ArrayList<>();
            //myYearlySalary.addAll(Arrays.asList(yearlySalary));
        }
        else
        {
            throw new IllegalArgumentException("The Salary can't have negative amount.");
        }
    }

    /**
     * Getter for attribute myYearlySalary for SalariedEmployee class
     * @return
     */
    public double getYearlySalary()
    {
        return myYearlySalary;
    }

    // Public methods

    @Override
    public double CalculatePayDay()
    {
        double value;
        value = getYearlySalary()/Config.NUMBER_OF_WEEKS;
        return value;
    }

    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "The Salaried Employee name           is: " + this.myNames + "\n";
        outputString += "The Salaried Employee date of birth  is: " + this.myBirthDate +"\n";
        outputString += "The Salaried Employee ID             is: " + this.myEmployeeID + "\n";
        outputString += "The Salaried Employee Year salary    is: " + this.myYearlySalary + "\n";
        //outputString += "The Salaried Employee pay per week   is: " + CalculatePayDay()+ "\n";

        return outputString;
    }
}

