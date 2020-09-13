package com.ejercicio2Eldar.ejercicio2Eldar.models;

public class BrandNotFoundException extends RuntimeException {

    public BrandNotFoundException(String brand) {
        super("Could not find brand " + brand);
    }
}
