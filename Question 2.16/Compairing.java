// Question 2.16 Compairing integers
// Compairing integers using if statements relational operator and equality operators

import java.util.Scanner; // program uses class Scanner

public class Compairing {
  // main method begins execution of Java application
  public static void main(String [] args) {
    // create Scanner to obtain object input from command line
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer:"); // Prompt
    int number1 = input.nextInt(); // read first number from user

    System.out.print("Enter second integer:"); // prompt
    int number2 = input.nextInt(); // read second number from user

    if (number1 == number2) {
      System.out.printf("%d == %d%n", number1, number2);
    }

    if (number1 != number2) {
      System.out.printf("%d != %d%n", number1, number2);
    }

    if (number1 < number2) {
      System.out.printf("%d < %d%n", number1, number2);
    }

    if (number1 > number2) {
      System.out.printf("%d > %d%n", number1, number2);
    }

    if (number1 <= number2) {
      System.out.printf("%d <= %d%n", number1, number2);
    }

    if (number1 >= number2) {
      System.out.printf("%d >= %d%n", number1, number2);
    }
    input.close();
  } // end method main
} // end class Compairing