package assignment04;
import java.util.*;

public class Employee{
  private Person person;
  private double salary;

  public Employee(Person aPerson){
    person = aPerson;
  }

  public void setSalary(double aSalary){
    salary = aSalary;
  }

  public String toString(){
    StringBuilder build = new StringBuilder();
    build.append(person.getFirstName());
    build.append(" ");
    build.append(person.getMiddleInitial());
    build.append(" ");
    build.append(person.getLastName());
    build.append(" ");
    build.append(" Salary: ");
    build.append(salary);

    return build.toString();
  }
}
