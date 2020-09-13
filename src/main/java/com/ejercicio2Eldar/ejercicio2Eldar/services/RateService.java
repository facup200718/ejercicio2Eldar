package com.ejercicio2Eldar.ejercicio2Eldar.services;

import com.ejercicio2Eldar.ejercicio2Eldar.models.Brand;
import com.ejercicio2Eldar.ejercicio2Eldar.models.BrandNotFoundException;

import java.util.Calendar;
import java.util.Date;

public class RateService {
    public static String calculateRate(String brand, Float amount) {
        Brand searchBrand = null;

        try {
            searchBrand = Brand.valueOf(brand);
        } catch (Exception e) {
            System.out.println(e);
            throw new BrandNotFoundException(brand);
        }


        String rate = null ;
        float ratePercentage = 0f;
        Date date = new Date();

        Calendar cal = Calendar.getInstance();
            cal.setTime(date);

        float day = cal.get(Calendar.DAY_OF_MONTH);
        float month = cal.get(Calendar.MONTH) + 1; //Enero es mes 0
        float year =  cal.get(Calendar.YEAR);

            switch (searchBrand) {
                case VISA:
                    ratePercentage = rateLimits(Float.parseFloat(Float.toString(year).substring(2))/month);
                    break;
                case AMEX:
                    ratePercentage = rateLimits(month * 0.1f);
                    break;
                case NARA:
                    ratePercentage = rateLimits(day * 0.5f);
                    break;
            }
        return String.format("%.02f",Double.valueOf((amount * 0.01) * ratePercentage));
    }

    public static float rateLimits (float ratePercentage) {
        ratePercentage = ratePercentage > 5f ? 5f : ratePercentage;
        ratePercentage = ratePercentage < 0.3f ? 0.3f : ratePercentage;
        return ratePercentage;
    }
}
