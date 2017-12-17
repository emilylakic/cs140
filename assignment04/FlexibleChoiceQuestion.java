package assignment04;
import java.util.*;
/**
 * A question with multiple choices.
 */
public class FlexibleChoiceQuestion extends ChoiceQuestion {
  public FlexibleChoiceQuestion(String qText){
    super(qText);
  }

  public void addChoice(String choice, boolean correct){
    throw new UnsupportedOperationException("Use the one-argument version");
  }

  public void addChoice(String choice){
    super.addChoice(choice, false);
  }

  private Set<String> answers = new HashSet<String>();

  public void addAnswer(int i){
    if(i <= 0)
      throw new IllegalArgumentException("Answers must be numbered from 1");
    answers.add("" + i);
  }

  public void presentQuestion() {
		super.display();
		System.out.print("Your answer (separate multiple answers by a space: ");;
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(checkAnswer(response));
	}

  public boolean checkAnswer(String response) {
    String[] parts = response.trim().split("\\s+");
    Set<String> responses = new HashSet<String>();

    for(String str : parts)
      responses.add(str);

    if(responses.size() != parts.length)
      System.out.println("You have repeated answers");

    if(responses.equals(answers))
      return true;

    int temp = responses.size();
    responses.removeAll(answers);
    if(responses.size() == 0){
      System.out.println("Your answers were correct but you missed some");
      return false;
    }

    if(responses.size() < temp){
      System.out.println("You have some correct answers and some incorrect ones");
      return false;
    }

    System.out.println("All your answers were wrong");
    return false;

  }
}
