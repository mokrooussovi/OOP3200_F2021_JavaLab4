package ca.durhamcollege.core;

import ca.durhamcollege.utility.Config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class HourlyWorker extends Employee
{
    // Instance variable
    private Double myHourlyRate;
    private Double myHoursPerWeek;

    // Parameterized Constructor
    /**
     * Initializes a person object based on parameters for HourlyWorker class.
     * @param fullName
     * @param birthDate
     * @param employeeID
     * @param hourlyRate
     * @param hoursPerWeek
     */
    public HourlyWorker(String fullName, LocalDate birthDate, String employeeID, final double hourlyRate, final double hoursPerWeek)
    {
        super(fullName, birthDate, employeeID);
        this.setHourlyRate(hourlyRate);
        this.setHoursPerWeek(hoursPerWeek);
    }

    // Accessors and Mutators

    /**
     * Setter for myHourlyRate attribute in a class of HourlyWorker
     * @param hourlyRate
     */
    final public void setHourlyRate(double hourlyRate)
    {
        if(hourlyRate >= Config.MINIMUM_WAGE)
        {
            myHourlyRate = hourlyRate;
            //myHourlyRate = new ArrayList<>();
            //myHourlyRate.addAll(Arrays.asList(hourlyRate));
        }
        else
        {
            throw new IllegalArgumentException("The minimum wage cannot be less than $17.00 per hour.");
        }
    }

    /**
     * Getter for myHourlyRate attribute in a class of HourlyWorker
     * @return
     */
    public double getHourlyRate()
    {
        return myHourlyRate;
    }

    /**
     * Setter for myHoursPerWeek attribute in a class of HourlyWorker
     * @param hoursPerWeek
     */
    final public void setHoursPerWeek(double hoursPerWeek)
    {
        if(hoursPerWeek <= Config.MAXIMUM_HOURS_PER_WEEK)
        {
            myHoursPerWeek = hoursPerWeek;
            //myHoursPerWeek = new ArrayList<>();
            //myHoursPerWeek.addAll(Arrays.asList(hoursPerWeek));
        }
        else
        {
            throw new IllegalArgumentException("The minimum wage cannot be less than $17.00 per hour.");
        }
    }

    /**
     * Getter for myHoursPerWeek attribute in a class of HourlyWorker
     * @return
     */
    public double getHoursPerWeek()
    {
        return myHoursPerWeek;
    }

    // Public methods
    /**
     * This basic method allows us to proceed with payment for HourlyWorker class.
     * @return double of calculated amount of payment
     */
    @Override
    public double CalculatePayDay()
    {
        double value;
        value = getHourlyRate() * getHoursPerWeek();
        return value;
    }

    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "The Hourly Worker name              is: " + this.myNames + "\n";
        outputString += "The Hourly Worker date of birth     is: " + this.myBirthDate +"\n";
        outputString += "The Hourly Worker ID                is: " + this.myEmployeeID + "\n";
        outputString += "The Hourly Worker hourly rate       is: " + this.myHourlyRate + "\n";
        outputString += "The Hourly Worker works hours per week: " + this.myHoursPerWeek + "\n";
        //outputString += "The Hourly Worker pay per week      is: " + CalculatePayDay()+ "\n";

        return outputString;
    }
}

