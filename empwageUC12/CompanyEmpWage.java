package com.bridgelabz.empwageUC12;

public class CompanyEmpWage {
	    public String companyName;								//Instance Variables
	    public int wagePerHr;
	    public int numWorkingDays;
	    public int maxHrsPerMonth;
	    public int totalEmpWage;
    public CompanyEmpWage(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {	    //Parameterised Constructor for Initializing Variables
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    	}
    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    @Override													 //Override the toString() from String Class
    public String toString() {
        return "Total Employee Wage for Company : "+ companyName +" is : "+totalEmpWage;
    }
}