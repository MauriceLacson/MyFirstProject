package com.company;

import com.company.classes.Customer;
import com.company.classes.Employee;
import com.company.classes.StaticMethods;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Employee firstEmployee = new Employee();

        firstEmployee.setFirstName("Arvin");
        firstEmployee.setLastName("Tabar");
        firstEmployee.setAge(21);
        firstEmployee.setDepartment("Preventive Maintenance");
        firstEmployee.setEmployeeID("A-1");
        firstEmployee.setPayGrade("High");

        System.out.println("--------EMPLOYEE CLASS--------");
        System.out.println("FIRST NAME: "+firstEmployee.getFirstName());
        System.out.println("AGE: "+firstEmployee.getAge());
        System.out.println("Department: " + firstEmployee.getDepartment());
        System.out.println("ID: "+firstEmployee.getEmployeeID());
        System.out.println("PAY GRADE: "+firstEmployee.getPayGrade());
        System.out.println("INTRODUCE YOURSELF: " + firstEmployee.introduceYourself("Arvin", "Tabar"));
        System.out.println("INTRODUCE YOURSELF: " + firstEmployee.introduceYourself("Arvin", 20, "High"));

        System.out.println("-----------Person Class-----------");
        //Person firstPerson = new Person();
        //System.out.println("INTRODUCE YOURSELF: " + firstPerson.introduceYourself("Edwin", "Casinillo"));

        Customer firstCustomer = new Customer();
        Customer secondCustomer = new Customer("Mark", "Malnegro");

        firstCustomer.setFirstName("Alvin");
        firstCustomer.setAge(22);
        firstCustomer.setAddress("Cordova, Cebu");
        firstCustomer.setTelephoneNumber(2567777);
        firstCustomer.setCustomerID("X-1");

        System.out.println("------------CUSTOMER CLASS----------");
        System.out.println("FIRST NAME: "+firstCustomer.getFirstName());
        System.out.println("AGE: "+firstCustomer.getAge());
        System.out.println("ADDRESS: " + firstCustomer.getAddress());
        System.out.println("CUSTOMER ID: "+firstCustomer.getCustomerID());
        System.out.println("TELEPHONE NUMBER: "+firstCustomer.getTelephoneNumber());
        System.out.println("INTRODUCE YOURSELF: " + firstCustomer.introduceYourself("Alvin", "Villacorta"));
        System.out.println("INTRODUCE YOURSELF: " + firstCustomer.introduceYourself("Cordova,Cebu",9));
        System.out.println("FIRST NAME: "+secondCustomer.getFirstName()+"\t" + "SECOND NAME: " + secondCustomer.getLastName());


        /*Person firstPerson = new Person();
        firstPerson.setFirstName("Maurice");
        firstPerson.setAge(18);
        firstPerson.setUserName("MauriceL");
        System.out.println("FIRST USER IS: "+ firstPerson.getFirstName() + "." + " His age is: " + firstPerson.getAge() + ".\n" + "HIS USERNAME IS: " + firstPerson.getUserName());

        Person secondPerson = new Person();
        secondPerson.setFirstName("Edwin");
        secondPerson.setAge(19);
        secondPerson.setUserName("EdwinC");
        System.out.println("SECOND USER IS: " + secondPerson.getFirstName() + ".\n" + "His age is: "  + secondPerson.getAge() + ". " + "HIS USERNAME IS: " + secondPerson.getUserName());

        Person thirdPerson = new Person();
        thirdPerson.setFirstName("Lendyl");
        thirdPerson.setAge(20);
        thirdPerson.setUserName("LendylM");
        System.out.println("THIRD USER IS: " + thirdPerson.getFirstName() + ".\n" +  "HIS AGE IS: " + thirdPerson.getAge() + ". " + "HIS USERNAME IS: " + thirdPerson.getUserName() );*/
//while loop
        System.out.println("\n*******************WHILE LOOP*****************\n");
        int num=10;
        while(num>0) {

            System.out.print(num);
            if(num>=2) {
                System.out.print("-");
            }
            --num;
        }

          //for loop
        System.out.println("\n\n*****************FOR-LOOP********************\n");

        for(int forLoop_num=1; forLoop_num<11; forLoop_num++) {
            System.out.print(forLoop_num);
            if(forLoop_num<=9) {
                System.out.print("-");
            }
        }


        //do-while
        System.out.println("\n\n***************DO WHILE-LOOP******************\n");
        int doWhile_num=1;
        do {
            System.out.print(doWhile_num);
            if(doWhile_num<=9)
            {
                System.out.print("-");
            }
            doWhile_num++;
        } while(doWhile_num<=10);



        //for-loop problem 2
        //Write a method with a for-loop that computes the sum first n positive integers.
        System.out.println("\nACTIVITY 2:FOR LOOP\n");
        System.out.println("The sum of: \n ");
        for(int n=1; n<=6;n++){
            System.out.println(" "+n+" ");

        }
        System.out.println("___");
        System.out.println(+StaticMethods.myMethod(6)+"\n");

        //factorial
        System.out.println("***********Factorial********* ");

        int fact=1;
        int number=7;

        for(int i=1; i<=number;i++){
            fact =i*fact;
        }
        System.out.println("The factorial of number is: "+ fact);

        //Even Numbers
        System.out.println("\n***************Even Numbers***************");



    }
}

