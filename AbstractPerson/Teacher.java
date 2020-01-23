
public class Teacher extends Person {
	private String subjectTaught;

	public Teacher(String name, String occupation, String subjectTaught) {
		super(name, occupation);
		this.subjectTaught = subjectTaught;
	}
	

	@Override
	public void whatDoYouDo() {
		super.whatDoYouDo();
		String response = "\nI love to teach " + subjectTaught + "!";
		System.out.println(response);
	}

	//Simple behavior--always asks the same question.
	@Override
	public void askQuestion() {
		System.out.println("What is your favorite class?");
	}


	//Simple behavior--always responds in the same way.
	@Override
	public void answerQuestion() {
		System.out.println("Get back to your homework!");
	}

}
