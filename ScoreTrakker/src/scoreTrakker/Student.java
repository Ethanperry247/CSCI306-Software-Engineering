package scoreTrakker;

public class Student implements Comparable<Student> {
	
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	

	public int getScore() {
		return score;
	}


	@Override
	public int compareTo(Student o) {
		if (this.getScore() > o.getScore()) {
			return 1;
		} else return 0;
	}

	@Override
	public String toString() {
		return name + " " + score;
	}

}
