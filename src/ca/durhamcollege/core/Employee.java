package ca.durhamcollege.core;


import ca.durhamcollege.utility.Config;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee extends Person
{
    // Instance variable
    protected String myEmployeeID; // Stores the employee's 8-digit ID as a string

    // Parameterized Constructor
    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @param employeeID -the intended the employee 8-digit number ID.
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */
    public Employee(final String fullName, final LocalDate birthDate, final String employeeID)
    {
        super(fullName, birthDate);
        this.setEmployeeID(employeeID);
    }

    /**
     * Setter setEmployeeID() allows us initiate employee ID and
     * add it to the ArrayList<>()
     * @param employeeID
     */
    final public void setEmployeeID(String employeeID)
    {
        employeeID = employeeID.trim();
        // check on length
        if(employeeID.length() != Config.LENGTH_EMPLOYEE_ID)
        {
            throw new IllegalArgumentException("The employee ID must have "
                    + "eight digits.");
        }
        // check on numeric data
        for (int index = 0; index < employeeID.length(); index++) {
            // extract the character at this position
            char number = employeeID.charAt(index);
            try {
                int numericNumber = (int) number;
            } catch (IllegalArgumentException illegalArgumentException) {
                throw new IllegalArgumentException("The employee ID must have "
                        + "eight digits.");
            }
        }
        myEmployeeID = employeeID;
        //myEmployeeID = new ArrayList<>();
        //myEmployeeID.addAll(Arrays.asList(employeeID));
    }

    /**
     * Getter for our class Employee
     * @return attribute of employee ID
     */
    public String getEmployeeID()
    {
        return myEmployeeID;
    }

    // Public methods
    /**
     * This basic method allows us to proceed with payment.
     * The method does not have implementation.
     * @return double of calculated amount of payment
     */
    public abstract double CalculatePayDay();

    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "The Employee name           is: " + this.myNames + "\n";
        outputString += "The Employee date of birth  is: " + this.myBirthDate +"\n";
        outputString += "The Employee ID             is: " + this.myEmployeeID + "\n";
        return outputString;
    }
}
