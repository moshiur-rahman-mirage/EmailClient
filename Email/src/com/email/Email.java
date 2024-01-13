package com.email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first and last name
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created "+this.firstName+" "+this.lastName);
        this.department=setDepartment();
        System.out.println("Department is "+this.department);
    }
    // ask for the department
    private String setDepartment(){
        System.out.print("Enter the department:\n1 for Sales\n2 for Accounting\n3 for Development \n0 for none " +
                "\nEnter Department Code: ");
        Scanner scan= new Scanner(System.in);
        int deptchoice = scan.nextInt();
        switch (deptchoice){
            case 1:
                return "Sales";
            case 2:
                return "Accounting";
            case 3:
                return "Development";
            default:
                return "";
        }
    }
    // generate a random password
private String generateRandomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*()";
        char[]password = new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
}
    //set mailbox capacity

    //set alternate email

    //change the email


}
