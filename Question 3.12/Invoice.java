// Question 3.12 Invoice for a hardwear store
// Invoice class that contains 4 instance variables

public class Invoice {
  private String partNumber; // instance variable for part number type string
  private String partDescription; // instance variable for par description type string
  private int quantity; // instance variable for quanity of items type int
  private double pricePerItem; // instance variable for price per item type double

  // Setters method to set name in object
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber; // stores name partNumber
  }

  public void setPartDescription(String partDescription) {
    this.partDescription = partDescription; // stores name partDescription
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity; // stores name quantity
  }

  public void setPricePerItem(double pricePerItem) {
    this.pricePerItem = pricePerItem; // stores name pricePerItem
  }

  // Getters method to retrieve the name from the object
  public String getPartNumber() {
    return partNumber; // return value of partNumber to caller
  }

  public String getPartDescription() {
    return partDescription; // return value of partDescription
  }

  public int getQuantity() {
    return quantity; // return value of quantity
  }

  public double getPricePerItem() {
    return pricePerItem; // return value of pricePerItem
  }

  public double getInvoiceAmount() {
    if (quantity < 0) {
        quantity = 0;
    }
    if (pricePerItem < 0.0) {
        pricePerItem = 0.0;
    }
    return quantity * pricePerItem;
}

  // Constructor initializes objects instance variables when oject is created
public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
  this.partNumber = partNumber;
  this.partDescription = partDescription;
  this.quantity = quantity;
  this.pricePerItem = pricePerItem;
}

}