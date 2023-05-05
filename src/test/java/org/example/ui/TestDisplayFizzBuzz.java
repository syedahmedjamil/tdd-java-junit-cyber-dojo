package org.example.ui;

import org.example.Main;
import org.example.problems.FizzBuzz;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestDisplayFizzBuzz {

    private int count = 0;
    private List<String> displayed = null;
    private static FizzBuzz fizzBuzz = null;

    @BeforeAll
    static void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @BeforeEach
    void init(){
        displayed = new ArrayList<>();
    }

    @Test
    void test_should_display_each_number() {
        Main.displayFizzBuzz(2, this::display, this::render);
        assertEquals(2, count);
    }

    @Test
    void test_should_render_each_number() {
        Main.displayFizzBuzz(2, this::display, this::render);
        assertEquals("1", displayed.get(0));
        assertEquals("2", displayed.get(1));
    }

    @Test
    void test_should_display_fizzbuzz_from_one_to_hundred() {
        Main.displayFizzBuzz(5, this::display, fizzBuzz::fizzBuzz);
        System.out.println(displayed);
        assertArrayEquals(displayed.toArray(), new String[]{"1", "2", "Fizz", "4", "Buzz"});
    }

    //mock
    String render(int num){
        return fizzBuzz.fizzBuzz(num);
    }

    void display(String text){
        count = count + 1;
        displayed.add(text);
    }
}