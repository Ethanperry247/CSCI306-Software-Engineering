
public class PetOwner extends Person {
	private String[] responses;
	private String[] questions;
	private String petType;
	private String petName;
	
	public PetOwner(String name, String occupation, String petType, String petName, String[] responses, String[] questions) {
		super(name, occupation);
		this.petType = petType;
		this.petName = petName;
		this.responses = responses;
		this.questions = questions;
	}

	@Override
	public void whatDoYouDo() {
		super.whatDoYouDo();
		String response = "\nI have a " + petType + ", and their name is " + petName + "!";
		System.out.println(response);
	}
	
	//Randomly chooses a question from an array of questions which is passed in upon construction.
	@Override
	public void askQuestion() {
		int randInt = (int)(Math.random() * questions.length);
		System.out.println(questions[randInt]);
	}

	//Randomly chooses a response from an array of responses which is passed in upon construction.
	@Override
	public void answerQuestion() {
		int randInt = (int)(Math.random() * responses.length);
		System.out.println(responses[randInt]);
	}
}
