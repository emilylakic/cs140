package assignment04;
import java.util.*;

public class Manager extends Employee{
  private String department;
  private ArrayList<Employee> team = new ArrayList<>();

  public Manager(Person p){
    super(p);
  }

  public void setDepartment(String aDepartment){
    department = aDepartment;
  }

  public void addToTeam(Employee e){
    team.add(e);
  }

  public String toString(){
    StringBuilder build = new StringBuilder();
    build.append(super.toString());
    build.append("\n");
    build.append("Department: ");
    build.append(department);
    build.append("\n");
    build.append("Team: ");
    for(int i = 0; i < team.size(); i++){
      build.append("\n");
      build.append(team.get(i));
    }
    return build.toString();
  }

}
