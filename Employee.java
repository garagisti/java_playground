import java.io.*;

public class Employee {
  String name;
  String jobTitle;
  double salary;

  public Employee() {
  }

  public void setName(String name) {
    this.name = name; 
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public double getSalary() {
    return this.salary;
  }

  public void details() {
    System.out.println("Name: "+this.name);
    System.out.println("Job Title: "+this.jobTitle);
    System.out.println("Salary: "+this.salary);
  }
}