package com.bridgelabz.empwageUC12;

import java.util.ArrayList;

public class EmployeeWageBuilder implements EmployeeWage {
	private int noOfCompanies = 0;
		ArrayList<CompanyEmpWage> lstCompanyEmpWages;						    //ArrayList for Company Wage Object

    public EmployeeWageBuilder() {
        lstCompanyEmpWages = new ArrayList<>();
    	}
    private void addCompanyEmpWages(String company, int wagePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        lstCompanyEmpWages.add(new CompanyEmpWage(company,wagePerHr,numOfWorkingDays,maxHrsPerMonth));
    	}
    public void calculateEmpWage() {
        for (CompanyEmpWage companyEmpWage : lstCompanyEmpWages) {
            companyEmpWage.setTotalEmpWage(this.calculateEmpWage(companyEmpWage));
            System.out.println(companyEmpWage.toString());
        	}
    	}
    public int calculateEmpWage(CompanyEmpWage companyEmpWage) {				    //Method to Calculate Employee Wage by Hours and Type
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;					        // Local Variables
    while( totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {		 //Compute Emp Wage for Month
        		totalWorkingDays++;    														 //Incrementing Working Days
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
    		return totalEmpHrs * companyEmpWage.wagePerHr;
    	}
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages Problem");						       //Welcome Message for Initial Purpose
        	EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
        employeeWageBuilder.addCompanyEmpWages("JIO",20,5,25);
        employeeWageBuilder.addCompanyEmpWages("VODAFONE",15,30,30);
        employeeWageBuilder.calculateEmpWage();
    }
}