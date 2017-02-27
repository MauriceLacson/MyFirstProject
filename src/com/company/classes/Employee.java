package com.company.classes;

/**
 * Created by nxtlvl on 2/17/2017.
 */
public class Employee extends Person {
    private String department;
    private String payGrade;
    private String employeeID;

    public String introduceYourself(String firstName, String lastName) {
        return "Hello I'm Employee: "+ firstName + " "+ lastName;
    }

    public String introduceYourself(String firstName, int age, String payGrade) {
        return "Hello I'm Employee: "+ firstName + " "+ "I'm" + " "+ age +". " +"My salary is " + payGrade + ".";
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
