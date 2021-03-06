//Authors: Ethan Perry and Shania Jo RunningRabit

/*
 * The Detective class will maintain information about each detective.
 */
public class Detective {
	private int lastBadgeNum;
	private String name;
	
	public Detective(String name, int badgeNum) {
		this.name = name;
		this.lastBadgeNum = badgeNum;
	}

	@Override
	public String toString() {
		return "Detective [Badge=" + lastBadgeNum + ", Name=" + name + "]";
	}
}
