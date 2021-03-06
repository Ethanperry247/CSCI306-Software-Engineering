
public abstract class Person {
	private String name;
	private String occupation;
	
	public Person(String name, String occupation) {
		this.name = name;
		this.occupation = occupation;
	}
	
	public void askName() {
		System.out.println("What is your name?");
	}
	
	public void giveName() {
		System.out.println("My name is " + name + ".");
	}
	
	public void whatDoYouDo() {
		System.out.print("I am a " + occupation + ".");
	}
	
	public abstract void askQuestion();
	
	public abstract void answerQuestion();

}
