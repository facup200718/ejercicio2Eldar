package com.ejercicio2Eldar.ejercicio2Eldar.models;

public class Transaction {
    private String brand;
    private float amount;
    private String rate;

    public String getBrand() {
        return brand;
    }

    public float getAmount() {
        return amount;
    }

    public String getRate() { return rate; }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
