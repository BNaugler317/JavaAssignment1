// Question 4.17 Calculating gas milage

import java.util.Scanner;

public class GasMilage {
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    int milesDriven;
    int gallonsUsed;
    int totalMiles = 0;
    int totalGallons = 0;

    while (true) {
      
      System.out.print("Enter Miles Driven or -1 to Calculate Total MPG: "); // prompt user to enter miles driven
      milesDriven = input.nextInt();

      if (milesDriven == -1){
        break;
      }

      System.out.print("Enter Gallons Used: "); // prompt user to enter gallons used
      gallonsUsed = input.nextInt();

      totalMiles = totalMiles + milesDriven;
      totalGallons = totalGallons + gallonsUsed;

    }
    System.out.printf("Total Miles per Gallon: %.2f%n", (double) totalMiles/
     (double) totalGallons); // calculates the total Miles per gallon
  
  input.close();

  }
}