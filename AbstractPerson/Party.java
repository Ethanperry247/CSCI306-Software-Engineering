import java.util.ArrayList;
/**
 * Party class. 
 *  
 * @author Mark Baldwin
 * @author Cyndi Rader
 * 
 * Purpose. Illustrate use of abstract classes
 */

public class Party {
	// Person is an abstract class
	private ArrayList<Person> people = new ArrayList<Person>();
	
	// Reminder: constant values are typically public and static (only one copy)
	public static final int MAX_QUESTIONS = 15;
	
	/**
	 * Constructor to set up the people in the party
	 */
	public Party() {
		// Add your person objects here. The following are included as examples
		people.add(new Teacher("Mr. Teacher", "Teacher", "Geometry"));
		
		// Arrays of responses and answers for the student and pet owner.
		String[] studentResponses = {"I hate homework.", "I like pizza."};
		String[] studentQuestions = {"What's for dinner?", "When's the big exam?", "Will you go to prom with me?"};
		String[] petOwnerResponses = {"I love my pets!", "I only use purina.", "I'm going to walk my pet."};
		String[] petOwnerQuestions = {"Do you like pets?", "Do you have a pet?", "Do you like yoga?"};
		people.add(new Student("Butterball", "Student", studentResponses, studentQuestions));
		people.add(new PetOwner("CatLady", "Yoga instructor", "Cat", "Esmerelda", petOwnerResponses, petOwnerQuestions));
		}
	
	/**
	 * Have people in the party ask other people questions
	 * 
	 * For simplicity, we'll just have people "ask" a question of the next
	 * person in the list. 	 
	 * 
	 */
	public void partyTime() {
		// initialize our asker and answerer
		int questionPerson = 0;
		int answerPerson = 1;
		// For simplicity, just doing a fixed number of questions
		int questionsAsked = 0;
		while (questionsAsked < MAX_QUESTIONS) {
			// display the question and answer
			people.get(questionPerson).askQuestion();
			people.get(answerPerson).answerQuestion();
			System.out.println();
			
			// set up for the next round
			questionsAsked++;
			questionPerson = (questionPerson + 1) % people.size();
			answerPerson = (answerPerson + 1) % people.size();			
		}
	}
	
	/**
	 * Allows introduction of all the people
	 * 
	 * Note that this function makes use of methods defined in the parent class
	 */
	public void introductions() {
		for (Person p : people) {
			p.askName();
			p.giveName();
			p.whatDoYouDo();
			System.out.println();
		}
		System.out.println("Welcome to the party, let's chat!\n");
	}
	
	/** 
	 * Main driver for testing
	 * @param args Input arguments for main (unused)
	 */
	public static void main(String[] args) {
		Party party = new Party();
		party.introductions();
		party.partyTime();
	}
	

}
