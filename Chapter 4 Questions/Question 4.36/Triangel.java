// Question 4.36 calculating the sides of a triangel

import java.util.Scanner;

public class Triangel {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);

    int side1;
    int side2;
    int side3;

    System.out.print("Enter side 1: "); // prompt user to enter side1
    side1 = input.nextInt();

    System.out.print("Enter side 2: "); // prompt user to enter side2
    side2 = input.nextInt();

    System.out.print("Enter side 3: "); // prompt user to enter side3
    side3 = input.nextInt();

    if ((side1 + side2 > side3) &&
        (side1 + side3 > side2) &&
        (side2 + side3 > side1)) {
      System.out.println("Triangel is valid");
    }else {
      System.out.println("Triangel not valid Please try again");
    }

    input.close();
  }
}