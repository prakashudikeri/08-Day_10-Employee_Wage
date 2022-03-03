package com.bridgelabz.empwageUC12;

public interface EmployeeWage {

    public static final int IS_PART_TIME = 1;				    		//Constants for class
    public static final int IS_FULL_TIME = 2;

    public void calculateEmpWage();									    //Methods for Calculating Employee Wages
    public int calculateEmpWage(CompanyEmpWage companyEmpWage);
}