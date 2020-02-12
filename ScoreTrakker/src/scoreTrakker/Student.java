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
//		if (score > o.score) {
//			return 1;
//		} else if (score > o.score) {
//			return -1;
//		} else return 0;
//		
//		return name.compareTo(o.name);
		
		return (int) Math.round((score-o.score)*10);
	}

	@Override
	public String toString() {
		return name + " " + score;
	}

}
