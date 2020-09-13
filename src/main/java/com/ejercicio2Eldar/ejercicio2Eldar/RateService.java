package com.ejercicio2Eldar.ejercicio2Eldar;

import java.util.Calendar;
import java.util.Date;

public class RateService {
    public static String calculateRate(String brand, Float amount) {
        Brand searchBrand = Brand.valueOf(brand);

        if(searchBrand == null){
            throw new BrandNotFoundException(brand);
        }

        String rate = null ;
        float ratePercentage = 0f;
        Date date = new Date();

        Calendar cal = Calendar.getInstance();
            cal.setTime(date);

        float day = cal.get(Calendar.DAY_OF_MONTH);
        float month = cal.get(Calendar.MONTH);
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
        rate = String.valueOf((amount / 100) * ratePercentage);
            return rate;
    }

    public static float rateLimits (float ratePercentage) {
        ratePercentage = ratePercentage > 5 ? 5 : ratePercentage;
        ratePercentage = ratePercentage < 0.3f ? 0.3f : ratePercentage;
        return ratePercentage;
    }
}
