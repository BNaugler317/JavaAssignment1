// Qustion 2.15 adding
// Make an application that adds to numbers from user input and display sum
import java.util.Scanner; // program uses class Scanner

public class Adding {
  // main method begins execution of Java application
  public static void main(String [] args) {
    // create a Scanner to obtain input from command window
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer:"); // prompt
    int number1 = input.nextInt(); // read first number from user

    System.out.print("Enter second integer:"); // prompt
    int number2 = input.nextInt(); // read second number from user

    int sum = number1 + number2; // adds numbers, than stores total in sum

    System.out.printf("Sum is %d%n", sum); // display sum
    input.close();
  } // end method main
} // end class Adding