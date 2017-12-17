package assignment04;
import java.util.*;

public class Demo{
  public static void main(String[] args){
    System.out.println("My name is Jeremy Henry Siegelstein");
    System.out.println("---------------------------------------");
    String question = new String("Which of the following are parts of my name?");
    FlexibleChoiceQuestion q = new FlexibleChoiceQuestion(question);

    q.addChoice("Jeremy");
    q.addChoice("Zachary");
    q.addChoice("Siegelstein");
    q.addChoice("Field");
    q.addChoice("Henry");

    q.addAnswer(1);
    q.addAnswer(3);
    q.addAnswer(5);

    q.presentQuestion();
  }
}
