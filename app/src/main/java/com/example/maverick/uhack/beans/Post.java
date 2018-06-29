package com.example.maverick.uhack.beans;

public class Post {

    private String accountName;
    private double capital;
    private double balance;
    private double returnRate;
    private int returnDate;

    public Post(){
    }

    public Post(String accountName, double capital, double balance, int returnDate, double returnRate){
        this.accountName = accountName;
        this.capital = capital;
        this.balance = balance;
        this.returnDate = returnDate;
        this.returnRate = returnRate;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }
}
