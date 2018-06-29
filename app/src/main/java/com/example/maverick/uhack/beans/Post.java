package com.example.maverick.uhack.beans;

public class Post {

    private String accountName;
    private String accountType;
    private double capital;
    private double balance;
    private double returnRate;
    private String returnDate;
    private String postDate;

    public Post() {
    }

    public Post(String postDate, String accountName, String accountType, double capital, double balance, String returnDate, double returnRate) {
        this.postDate = postDate;
        this.accountName = accountName;
        this.accountType = accountType;
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
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

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }
}