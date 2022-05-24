/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Hershy_Tabak
 */
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    
    
    public Loan(){
        this(2.5, 1, 1000);
    }
    public Loan(double rate, int years, double amount){
        this.annualInterestRate = rate;
        this.numberOfYears = years;
        this.loanAmount = amount;
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public java.util.Date getLoanDate() {
        return loanDate;
    }
    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }
    public void setNumberOfYears(int years) {
        this.numberOfYears = years;
    }
    public void setLoanAmount(double amount) {
        this.loanAmount = amount;
    }
    public double getMonthlyAmount() {
        double monthlyInterest = annualInterestRate / 12;
        double monthlyPayment = loanAmount * monthlyInterest / (1
                - 1 / Math.pow(1 + monthlyInterest, numberOfYears * 12)) ;
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment;
        totalPayment = getMonthlyAmount() * numberOfYears * 12;
        return totalPayment;
    }
}
