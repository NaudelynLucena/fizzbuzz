package org.factoriaf5.fizzbuzz;

public class FizzYFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.println(FizzBuzz(i));
        }
    }

    static boolean contains(int digit, int number) {
        return String.valueOf(number).contains(String.valueOf(digit));
    }

    public static String FizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if ((number % 3 == 0)|| contains(3, number)){
            return "Fizz";
        } else if ((number % 5 == 0) || contains(5, number)){
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}