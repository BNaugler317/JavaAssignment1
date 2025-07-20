// Question 4.22 Tubular output

public class Tubular {
  public static void main(String [] args) {

   int row = 1;
   while (row <= 5) {
    System.out.println(row + " "+ (row * 10)  + " " + 
    (row * 100) + " " + (row * 1000));
    row++;
  }
  }
}