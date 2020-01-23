
public class CodingBatIndividual {
	
		//Author: Ethan Perry
		//tenRun Excercise
		public int[] tenRun(int[] nums) {
		  int[] newRun = new int[nums.length];
		  int currentTen = 0;
		  boolean foundMultOfTen = false;
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i]%10 == 0 && currentTen == 0) {
		      currentTen = nums[i];
		      newRun[i] = currentTen;
		      foundMultOfTen = true;
		    } else if (nums[i]%10 == 0 && currentTen != nums[i]) {
		      currentTen = nums[i];
		      newRun[i] = currentTen;
		    } else if (foundMultOfTen) {
		        newRun[i] = currentTen;
		    } else {
		      newRun[i] = nums[i];
		    }
		  }
		  
		  return newRun;
		}
		/*
		tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]	[2, 10, 10, 10, 20, 20]	OK	
		tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]	[10, 10, 20, 20]	OK	
		tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]	[10, 10, 10, 20]	OK	
		tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]	[1, 2, 50, 50]	OK	
		tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]	[1, 20, 50, 50]	OK	
		tenRun([10, 10]) → [10, 10]	[10, 10]	OK	
		tenRun([10, 2]) → [10, 10]	[10, 10]	OK	
		tenRun([0, 2]) → [0, 0]	[0, 0]	OK	
		tenRun([1, 2]) → [1, 2]	[1, 2]	OK	
		tenRun([1]) → [1]	[1]	OK	
		tenRun([]) → []	[]	OK	
		 */

		
		//Author: Ethan Perry
		//scoresIncreasing Excercise
		public boolean scoresIncreasing(int[] scores) {
			  boolean checkIncreasing = true;
			  for (int i = 1; i < scores.length; i++) {
			    if (scores[i] < scores[i-1]) {
			      checkIncreasing = false;
			    }
			  }
			  return checkIncreasing;
			}
		/*
		scoresIncreasing([1, 3, 4]) → true	true	OK	
		scoresIncreasing([1, 3, 2]) → false	false	OK	
		scoresIncreasing([1, 1, 4]) → true	true	OK	
		scoresIncreasing([1, 1, 2, 4, 4, 7]) → true	true	OK	
		scoresIncreasing([1, 1, 2, 4, 3, 7]) → false	false	OK	
		scoresIncreasing([-5, 4, 11]) → true	true	OK
		 */

		
		//Author: Ethan Perry
		//repeatEnd Excercise
		public String repeatEnd(String str, int n) {
			  String repeatedEnd = "";
			  for (int i = 0; i < n; i++) {
			    repeatedEnd += str.substring(str.length() - n);
			  }
			  return repeatedEnd;
			}
		/*
		repeatEnd("Hello", 3) → "llollollo"	"llollollo"	OK	
		repeatEnd("Hello", 2) → "lolo"	"lolo"	OK	
		repeatEnd("Hello", 1) → "o"	"o"	OK	
		repeatEnd("Hello", 0) → ""	""	OK	
		repeatEnd("abc", 3) → "abcabcabc"	"abcabcabc"	OK	
		repeatEnd("1234", 2) → "3434"	"3434"	OK	
		repeatEnd("1234", 3) → "234234234"	"234234234"	OK	
		repeatEnd("", 0) → ""	""	OK	
		 */

		
		//Author: Ethan Perry
		//canBalance Excercise
		public boolean canBalance(int[] nums) {
			  boolean equalSides = false;
			  for (int i = 0; i < nums.length; i++) {
			    int firstHalfSum = 0;
			    int secondHalfSum = 0;
			    for (int j = 0; j < i; j++) {
			      firstHalfSum += nums[j];
			    }
			    
			    for (int j = nums.length - 1; j >= i; j--) {
			      secondHalfSum += nums[j];
			    }
			    if (firstHalfSum == secondHalfSum) {
			      equalSides = true;
			    }
			  }
			  return equalSides;
			}
		/*
		canBalance([1, 1, 1, 2, 1]) → true	true	OK	
		canBalance([2, 1, 1, 2, 1]) → false	false	OK	
		canBalance([10, 10]) → true	true	OK	
		canBalance([10, 0, 1, -1, 10]) → true	true	OK	
		canBalance([1, 1, 1, 1, 4]) → true	true	OK	
		canBalance([2, 1, 1, 1, 4]) → false	false	OK	
		canBalance([2, 3, 4, 1, 2]) → false	false	OK	
		canBalance([1, 2, 3, 1, 0, 2, 3]) → true	true	OK	
		canBalance([1, 2, 3, 1, 0, 1, 3]) → false	false	OK	
		canBalance([1]) → false	false	OK	
		canBalance([1, 1, 1, 2, 1]) → true	true	OK
		*/
}
