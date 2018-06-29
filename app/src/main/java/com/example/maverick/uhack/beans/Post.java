package com.example.maverick.uhack;

public class Post {

    private String accountName;
    private float capital;
    private float balance;
    private float returnRate;
    private String returnDate;

    public Post(){
    }

    public Post(String accountName, float capital, float balance, String returnDate, float returnRate){
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

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(float returnRate) {
        this.returnRate = returnRate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }





}
