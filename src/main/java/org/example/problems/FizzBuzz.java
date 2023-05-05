package org.example.problems;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        String value = "";
        if (number % 3 == 0)
            value = "Fizz";
        if (number % 5 == 0)
            value = value + "Buzz";
        if (value.equals(""))
            value = String.valueOf(number);
        return value;
    }

}
