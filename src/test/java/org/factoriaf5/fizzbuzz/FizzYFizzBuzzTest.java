package org.factoriaf5.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzYFizzBuzzTest {
    private FizzYFizzBuzz fizzYFizzBuzz;

    @BeforeEach
    public void init() {
        this.fizzYFizzBuzz = new FizzYFizzBuzz();

        }

    @Test
    public void testFizzBuzzFromOneToTwentyFive() {
        String[] expectedResults = {
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
            "Fizz", "22", "Fizz", "Fizz", "Buzz"
        };

        for (int i = 1; i <= 25; i++) {
            assertEquals(expectedResults[i - 1], FizzYFizzBuzz.FizzBuzz(i));
        }
    }

    @Test
    public void testFizzBuzz() {
        assertThat(FizzYFizzBuzz.FizzBuzz(1), is("1"));
        assertThat(FizzYFizzBuzz.FizzBuzz(2), is("2"));
        assertThat(FizzYFizzBuzz.FizzBuzz(3), is("Fizz"));
        assertThat(FizzYFizzBuzz.FizzBuzz(4), is("4"));
        assertThat(FizzYFizzBuzz.FizzBuzz(5), is("Buzz"));
        assertThat(FizzYFizzBuzz.FizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzYFizzBuzz.FizzBuzz(13), is("Fizz"));
        assertThat(FizzYFizzBuzz.FizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void testContains() {
        assertThat(FizzYFizzBuzz.contains(3, 13), is(true));
        assertThat(FizzYFizzBuzz.contains(5, 25), is(true));
        assertThat(FizzYFizzBuzz.contains(3, 22), is(false));
        assertThat(FizzYFizzBuzz.contains(5, 24), is(false));
    }
}
