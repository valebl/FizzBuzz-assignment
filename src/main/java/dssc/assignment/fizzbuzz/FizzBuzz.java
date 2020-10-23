package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {

    }

    public String convert(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }
}
