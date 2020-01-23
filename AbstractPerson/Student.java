
public class Student extends Person {
	private static int responseNumber;
	private static int questionNumber;
	private String[] responses;
	private String[] questions;
	
	public Student(String name, String occupation, String[] responses, String[] questions) {
		super(name, occupation);
		this.responses = responses;
		this.questions = questions;
		// TODO Auto-generated constructor stub
	}
	
	//Adds an additional println after stating occupation to affirm that the output is pretty.
	@Override
	public void whatDoYouDo() {
		super.whatDoYouDo();
		System.out.println();
	}

	//Asks questions in order from an array of questions passed in upon construction.
	@Override
	public void answerQuestion() {
		String response = responses[responseNumber];
		if (responseNumber < responses.length - 1) {
			responseNumber++;
		} else {
			responseNumber = 0;
		}
		System.out.println(response);
	}

	//Asks responses in order from an array of responses passed in upon construction.
	@Override
	public void askQuestion() {
		String question = questions[questionNumber];
		if (questionNumber < questions.length - 1) {
			questionNumber++;
		} else {
			questionNumber = 0;
		}
		System.out.println(question);
	}
}
