package com.ejercicio2Eldar.ejercicio2Eldar;

public class BrandNotFoundException extends RuntimeException {

    BrandNotFoundException(Brand brand) {
        super("Could not find employee " + brand);
    }
}
