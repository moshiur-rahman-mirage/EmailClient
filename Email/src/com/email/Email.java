package com.email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private String email;
    private String companyName=".funafux.com";
    private int passwordLength=10;
    // Constructor to receive first and last name
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created "+this.firstName+" "+this.lastName);
        this.department=setDepartment();
        System.out.println("Department is "+this.department);
        this.password=generateRandomPassword(passwordLength);
        System.out.println("your password is "+this.password);
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department+companyName;
        System.out.println(email);
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

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }

    //set alternate email
    public String showInfo(){
        return "Display Name: "+firstName+" "+lastName+"\nCompany Email "+email+
                "\nmailbox Capacity: "+mailboxCapacity+
                "\nAlterName Email "+alternateEmail;
    }
    //change the email


}
