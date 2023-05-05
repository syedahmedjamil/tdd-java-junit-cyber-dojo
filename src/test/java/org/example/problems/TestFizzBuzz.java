package org.example.problems;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFizzBuzz {

    private static FizzBuzz fizzBuzz = null;
    @BeforeAll
    static void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void test_should_return_number_for_integer() {
        assertEquals("2", fizzBuzz.fizzBuzz(2));
    }
    @Test
    void test_should_return_fizz_for_three() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }
    @Test
    void test_should_return_buzz_for_five() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }
    @Test
    void test_should_return_fizz_for_multiple_of_three() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(12));
    }

    @Test
    void test_should_return_buzz_for_multiples_of_five(){
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
    }
    @Test
    void test_should_return_fizzbuzz_for_multiples_of_five_and_three(){
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }
}