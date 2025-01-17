package dssc.assignment.fizzbuzz;

// import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "41, 41"})
    void numbers_not_divisible_by_3_or_5_to_strings(int number, String expected) {
        assertEquals(expected, fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 24})
    void multiples_of_3_to_Fizz(int number) {
        assertEquals("Fizz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 100})
    void multiples_of_5_to_Buzz(int number) {
        assertEquals("Buzz", fizzBuzz.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45})
    void multiples_of_3_and_5_to_FizzBuzz(int number) {
        assertEquals("FizzBuzz", fizzBuzz.convert(number));
    }
}

    /*@Test
    void number_3_to_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void number_6_to_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(6));
    }

    @Test
    void number_24_to_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(24));
    }/*

    /*@Test
    void number_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void number_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    void number_40() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("40", fizzBuzz.convert(40));
    }*/

