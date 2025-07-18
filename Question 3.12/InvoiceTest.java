// InvoiceTest
// creating and manipulating Invoice objects
import java.util.Scanner;

public class InvoiceTest {
  public static void main(String [] args) {
    // create a scanner object to obtain input from the command terminal
    Scanner input = new Scanner(System.in);

    // create an Invoice object and assign it to myInvoice
    Invoice myInvoice = new Invoice("A5781","Hammer",5,9.99);

    // display initial value of name (null)
    System.out.printf("Inital name is: %s%n%n", myInvoice.getPartNumber());

    // prompt for and read name
    System.out.println("Please enter part number:");
    String partNumber = input.nextLine(); // read a line of text
    myInvoice.setPartNumber(partNumber); // put theName in myInvoice
    System.out.println(); // outputs a blank line

    System.out.println("Please enter part description:");
    String partDescription = input.nextLine(); // read a line of text
    myInvoice.setPartDescription(partDescription); // put theName in myInvoice
    System.out.println(); // outputs a blank line
    
    System.out.println("Please enter quantity:");
    int quantity = input.nextInt(); // read a line of text
    myInvoice.setQuantity(quantity); // put theName in myInvoice
    System.out.println(); // outputs a blank line

    System.out.println("Please enter price per item:");
    double pricePerItem = input.nextDouble(); // read a line of text
    myInvoice.setPricePerItem(pricePerItem); // put theName in myInvoice
    System.out.println(); // outputs a blank line

    // display the name stored in the object myInvoice
    System.out.printf("Part number in object myInvoice is: %n%s%n", myInvoice.getPartNumber());

    System.out.printf("Part description in object myInvoice is: %n%s%n", myInvoice.getPartDescription());

    System.out.printf("Quantity in object myInvoice is: %n%s%n", myInvoice.getQuantity());

    System.out.printf("Price per item in object myInvoice is: %n%s%n", myInvoice.getPricePerItem());

    System.out.printf("Invoice total is: $%.2f%n", myInvoice.getInvoiceAmount());


    input.close();

}
}