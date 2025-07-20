// Question 4.37 Right angel Triangle validation

import java.util.Scanner;

public class RightTri {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);

    int A;
    int B;
    int C;

    System.out.print("Enter A: "); // prompt user to enter A
    A = input.nextInt();

    System.out.print("Enter B: "); // prompt user to enter B
    B = input.nextInt();

    System.out.print("Enter C: "); // prompt user to enter C
    C = input.nextInt();

     if ((A * A + B * B == C * C) || // if statment checks pythagorean theorem
        (A * A + C * C == B * B) ||
        (B * B + C * C == A * A)) {
      System.out.println("Right Angle Triangle is valid");
    }else {
      System.out.println("Right Angle Triangle not valid Please try again");
    }

    input.close();

  }
}