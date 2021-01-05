package com.cucumber.practice;

public class CalculatePercentageService {
    public String getDiscountOffer(Integer price) {
        String percentage = "DA";
        if(price > 5000 && price < 10000)
            percentage = "10%";
        if(price > 10000)
            percentage = "15%";
        return percentage ;
    }
}
