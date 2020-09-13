package com.ejercicio2Eldar.ejercicio2Eldar;

public class BrandNotFoundException extends RuntimeException {

    BrandNotFoundException(String brand) {
        super("Could not find brand " + brand);
    }
}
