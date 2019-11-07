import java.io.*

public class Employee {
  String name;
  String jobTitle;
  float salary;

  public Employee() {

  }

  public setName(name) {
    this.name = name; 
  }

  public setjobTitle(jobTitle) {
    this.jobTitle = jobTitle;
  }

  public setSalary(salary) {
    this.salary = salary;
  }

  public String getName(name) {
    return this.name;
  }

  public String setjobTitle(jobTitle) {
    return this.jobTitle;
  }

  public int setSalary(salary) {
    return this.salary;
  }

  public void details() {
    System.out.println("Name: "+this.name)
    System.out.println("Job Title: "+this.jobTitle)
    System.out.println("Salary: "+this.salary)
  }
}