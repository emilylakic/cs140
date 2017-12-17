package assignment04;
import java.util.*;

public class ManagerTester{
  public static void main(String[] args){
    Person person1 = new Person("Schwartzberg", "Alex", 'J');
    Person person2 = new Person("Rahman", "Uttsow", 'N');
    Person person3 = new Person("Field", "Zachary", 'D');
    Person person4 = new Person("Siegelstein", "Jeremy", 'H');
    Person person5 = new Person("Einstein", "Albert", 'J');
    Person person6 = new Person("Newton", "Isaac", 'L');
    Person person7 = new Person("Euler", "Leonhard", 'B');

    Manager manager1 = new Manager(person1);
    Manager manager2 = new Manager(person4);

    Employee employee1 = new Employee(person2);
    Employee employee2 = new Employee(person3);
    Employee employee3 = new Employee(person5);
    Employee employee4 = new Employee(person6);
    Employee employee5 = new Employee(person7);

    employee1.setSalary(100000);
    employee2.setSalary(75000);
    employee3.setSalary(125000);
    employee4.setSalary(150000);
    employee5.setSalary(175000);
    manager1.setSalary(300000);
    manager2.setSalary(500000);

    manager1.setDepartment("Teaching");
    manager2.setDepartment("Ingenuity");

    manager1.addToTeam(employee1);
    manager1.addToTeam(employee2);

    manager2.addToTeam(employee3);
    manager2.addToTeam(employee4);
    manager2.addToTeam(employee5);

    System.out.println(manager1);
    System.out.println("------------------------------");
    System.out.println(manager2);

  }
}
