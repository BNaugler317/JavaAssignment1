// Question 3.13 Employee class
// Employee class contains 3 instance variables

public class Employee {
  private String firstName; // instance variable for first name
  private String lastName; // instance variable for last name
  private double monthlySalary; // instance variable for monthly salary 

  // setter method to name object
  public void setFirstName(String firstName) {
    this.firstName = firstName; // stores name firstName
  }

  public void setLastName(String lastName) {
    this.lastName = lastName; // stores name lastName
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary; // stores name monthlySalary
  }

  // Getters method to retrieve the name from the object
  public String getFirstName() {
    return firstName; // return value of firstName
  }

  public String getLastName() {
    return lastName; // return value of lastName
  }

  public double getMonthlySalary() {
    return monthlySalary; // return value of monthlySalary
  }

  // Constructor initalizes object instance variable when object is created
  public Employee(String firstName, String lastName, double monthlySalary) {
    this.firstName = firstName;
    this.lastName = lastName;
  if (monthlySalary > 0.0)
    this.monthlySalary = monthlySalary;
  }
}