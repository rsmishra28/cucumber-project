package com.learn.boot.demo;

public class FizzBuzz {
    public String play(int number) throws IllegalAccessException {
        if(number == 0 )
            throw  new IllegalAccessException("Number not correct");
       /* if(number%3 == 0 && number % 5 == 0)
            return "FizzBuzz";*/
        if(number%3 == 0 )
            return "Fizz";
        if(number%5 == 0 )
            return "Buzz";

        return String.valueOf(number);
    }
}
