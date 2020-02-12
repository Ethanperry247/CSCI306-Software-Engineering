package scoreTrakker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {

	private ArrayList<Student> studentList;
	private String[] files = { "scores.txt", "badscore.txt", "nofile.txt" };

	public ScoreTrakker() {
		studentList = new ArrayList<Student>();
	}

	public void loadDataFromFile(String fileName) throws FileNotFoundException {
		String name = "";
		String line = "";
		FileReader file = new FileReader(fileName);
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			scanner.nextLine();
			name = scanner.nextLine();
			line = scanner.next();

			try {
				int score = Integer.parseInt(line);
				Student student = new Student(name, score);
				studentList.add(student);

			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println("Incorrect format for [" + name + "] not a valid score: " + line);
				System.out.println();
			}
		}

	}

	public void printInOrder() {
		Collections.sort(studentList);
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	public void processFiles() {
		for (String file : files) {
			try {
				loadDataFromFile(file);
				printInOrder();
				studentList = new ArrayList<Student>();
			} catch (FileNotFoundException e) {
				System.out.println();
				System.out.println("Can't find file: " + file);
			}
		}
	}

	public static void main(String[] args) {

		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles();

	}

}
