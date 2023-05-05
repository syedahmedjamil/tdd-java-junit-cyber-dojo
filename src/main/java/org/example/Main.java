package org.example;

import org.example.problems.FizzBuzz;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    static FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {

        displayFizzBuzz(100, System.out::println, fizzBuzz::fizzBuzz);
    }

    public static void displayFizzBuzz(int count, Consumer<String> display, Function<Integer, String> render) {
        for (int i = 0; i < count; i++)
            display.accept(render.apply(i + 1));
    }
}