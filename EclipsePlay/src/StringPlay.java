import java.awt.Point;


public class StringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cPlusPlus = "C++ is cool";
		String java = "I love Java";
		
		String javaIsCool = cPlusPlus.replace("C++", java.substring(7));
		
		System.out.println(javaIsCool);
		
		Point firstPoint = new Point(10,10);
		Point secondPoint = new Point(10,10);
		
		System.out.println(firstPoint == secondPoint);
		
		
		String firstString = "capitalized";
		String secondString = "capitalized";
		String lowerString = "uncapitalized";
		String thirdString = lowerString.substring(3);
		String capitalString = "Capitalized";
		
		System.out.println("First == Second: " + (firstString == secondString));
		System.out.println("First == Third: " + (firstString == thirdString));
		System.out.println("First.equals(Third): " + firstString.equals(thirdString));
		System.out.println("First.equalsIgnoreCase(Capital): " + firstString.equalsIgnoreCase(capitalString));

		System.out.println("\"==\" is a bad coding habit which can lead to errors.");
	}

}
