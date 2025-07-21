// Question 3.14 Date Class
// DateClass contains 3 instance variables

public class Date {
  private int day; // instance variable for day
  private int month; // instance variable for month
  private int year; // instance variable for year

  // setter method to name object
  public void setDay(int day) {
    this.day = day; // stores name day
  }
  public void setMonth(int month) {
    this.month = month; // stores name month
  }
  public void setYear(int year) {
    this.year = year; // stores name year
  }

  // Getters method to retrieve the name from the object
  public int getDay() {
    return day; // returns value of day
  }
  public int getMonth() {
    return month; // returns value of month
  }
  public int getYear() {
    return year; // returns value of year
  }

  // Constructor initalizes object instance variable when object is created
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public void displayDate() {
    System.out.printf("%d/%d/%d%n", month, day, year);
  }
}