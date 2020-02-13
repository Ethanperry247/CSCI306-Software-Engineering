package scoreTrakker;

public class Student implements Comparable<Student> {
	
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}


	@Override
	public int compareTo(Student o) {
		
		// If you desire to sort by name:
		// return name.compareTo(o.name);
		
		// Or sort by score:
		return (int)Math.round((score-o.score)*10);
	}

	@Override
	public String toString() {
		return name + " " + score;
	}

}
