package com.ejercicio2Eldar.ejercicio2Eldar;

public class Transaction {
    private Brand brand;
    private float amount;

    public Transaction (Brand brand, float amount) {
        this.brand = brand;
        this.amount = amount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
