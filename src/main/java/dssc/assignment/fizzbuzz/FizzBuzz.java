package dssc.assignment.fizzbuzz;

public class FizzBuzz {

    public static void main(String... args) {

    }

    public String convert(int number) {
        if (number == 5) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(number);
        }
    }
}
