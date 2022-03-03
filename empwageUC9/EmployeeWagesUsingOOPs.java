package com.bridgelabz.empwageUC9;

public class EmployeeWagesUsingOOPs {
    public static final int IS_PART_TIME = 1;																 //Constants for class
    public static final int IS_FULL_TIME = 2;
	    private String companyName;																			//Instance Variables
	    private int wagePerHr;
	    private int numWorkingDays;
	    private int maxHrsPerMonth;
	    private int totalEmpWage;  
    public EmployeeWagesUsingOOPs(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {	 //Parameterised Constructor for Initializing Variables
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    	}
    public void calculateEmpWage() {															    //Method to Calculate Employee Wage by Hours and Type
    	int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;									    // Local Variables        
    while( totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numWorkingDays) {				//Compute Emp Wage for Month
        	totalWorkingDays++;     //Incrementing Working Days
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case IS_PART_TIME:
                System.out.println("Employee is Present as PART TIME");
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                System.out.println("Employee is Present as FULL TIME");
                empHrs = 8;
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
                break;
        		}
        totalEmpHrs += empHrs;
        System.out.println("Day No :"+ totalWorkingDays +" Emp Hrs: "+ empHrs);
		}
    totalEmpWage = totalEmpHrs * wagePerHr;
	}  
    @Override																					//Override the toString() from String Class
    public String toString() {
        return "Total Employee Wage for Company : "+ companyName +" is : "+totalEmpWage;
    	}
    public static void main(String[] args) {  
        System.out.println("Welcome to Employee Wages Problem");		 						//Welcome Message for Initial Purpose
        EmployeeWagesUsingOOPs jio = new EmployeeWagesUsingOOPs("JIO",20,10,30);
        EmployeeWagesUsingOOPs vodafone = new EmployeeWagesUsingOOPs("VODAFONE",15,5,25);
        jio.calculateEmpWage();
        System.out.println(jio.toString());
        vodafone.calculateEmpWage();
        System.out.println(vodafone.toString());
    }
}