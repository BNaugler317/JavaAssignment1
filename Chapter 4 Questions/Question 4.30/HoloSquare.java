// Question 4.30 creating a Holo Square with prompts

import java.util.Scanner;

public class HoloSquare {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    int width;
    
    System.out.println("input width number: "); // prompt for width
    width = input.nextInt();

    int row = 1;

    while (row <= width) {
      int column = 1;
      while (column <=width) {
        if (row == 1 || row == width || column == 1 || column == width)
            System.out.print("*");
        else
            System.out.print(" ");
        column++;
    }
    System.out.println();
    row++;
    }
    
    input.close();

  }
}