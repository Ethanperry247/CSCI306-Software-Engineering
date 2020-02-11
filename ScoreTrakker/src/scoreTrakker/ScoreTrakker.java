package scoreTrakker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	
	private ArrayList<Student> studentList; 

	public ScoreTrakker() {
		studentList = new ArrayList<Student>();
	}
	
	public void loadDataFromFile(String fileName) {
		try {
			FileReader file = new FileReader(fileName);
			Scanner scanner = new Scanner(file);
			
			
			while (scanner.hasNextLine()) {
				scanner.nextLine();
				String name = scanner.nextLine();
				int score = scanner.nextInt();
				
				Student student = new Student(name, score);
				studentList.add(student);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printInOrder() {
		// Collections.sort(this.studentList);
		for (Student student: studentList) {
			System.out.println(student);
		}
	}
	
	public void processFiles() {
		loadDataFromFile("scores.txt");
		printInOrder();
	}
	
	public static void main(String[] args) {
		
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles();
		
	}

}
