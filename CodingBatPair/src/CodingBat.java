
public class CodingBat {
	
	public boolean evenlySpaced(int a, int b, int c) {
		if (a > b && a > c) {
			if (b > c) {
				if (a - b == b - c) {
					return true;
				}
			} else {
				if (a - c == c - b) {
					return true;
				}
			}
		} else if (b > c && b > a) {
			if (a > c) {
				if (b - a == a - c) {
					return true;
				}
			} else {
				if (b - c == c - a) {
					return true;
				}
			}
		} else if (c > b && c > a) {
			if (a > b) {
				if (c - a == a - b) {
					return true;
				}
			} else {
				if (c - b == b - a) {
					return true;
				}
			}
		} else if (a == b && a == c) {
			return true;
		}
		return false;
	}
	
	public String plusOut(String str, String word) {
		for(int i = 0; i < str.length(); i++) {
			if (i == str.length() - word.length()) {
				if (!str.substring(i).equals(word)) {
					str = str.substring(0, i);
					for (int j = 0; j < word.length(); j++) {
						str += "+";
					}
					i += word.length();
				}
			} else {
				if (str.substring(i, word.length() + i).equals(word)) {
					i = i + word.length() - 1;
				} else {
					str = str.substring(0, i) + "+" + str.substring(i + 1);
				}
			}
		}
		return str;
	}
	
	public int countClumps(int[] nums) {
		  int clumps = 0;
		  for (int i = 0; i < nums.length - 1; i++) {
		    int element = nums[i];
		    boolean checkSimilarity = false;
		    i++;
		    while (nums[i] == element && i < nums.length - 1) {
		      i++;
		      checkSimilarity = true;
		    }
		    if (checkSimilarity) {
		      clumps++;
		    }
		  }
		  return clumps;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodingBat bat = new CodingBat();
		// System.out.println(bat.evenlySpaced(4, 2, 9));
		
		System.out.println(bat.plusOut("123xy123", "xy"));

	}

}
