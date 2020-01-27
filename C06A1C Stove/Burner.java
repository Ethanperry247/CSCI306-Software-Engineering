
public class Burner {
	// Can I make this public?
	public enum Temperature { BLAZING, HOT, WARM, COLD };
	private Temperature myTemperature = Burner.Temperature.COLD;
	private Setting mySetting = Setting.OFF;
	private int timer = 0;
	private static final int TIME_DURATION = 2;
	
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	public String displayTemperature() {
		switch (this.getMyTemperature()) {
			case COLD:
				return "cooool";
			case WARM:
				return "warm";
			case HOT:
				return "CAFEFUL";
			case BLAZING:
				return "VERY HOT! DON'T TOUCH";
		}
		return "";
	}
	
	public void plusButton() {
		switch (mySetting) {
			case MEDIUM:
				mySetting = Setting.HIGH;
				break;
			case LOW:
				mySetting = Setting.MEDIUM;
				break;
			case OFF:
				mySetting = Setting.LOW;
				break;
		default:
			break;
		}
		if (timer == 0) {
			timer += TIME_DURATION;
		}
	}
	
	public void minusButton() {
		switch (mySetting) {
			case HIGH:
				mySetting = Setting.MEDIUM;
				break;
			case MEDIUM:
				mySetting = Setting.LOW;
				break;
			case LOW:
				mySetting = Setting.OFF;
				break;
		default:
			break;
		}
		if (timer == 0) {
			timer += TIME_DURATION;
		}
	}
	
	public void updateTemperature() {
		if (timer != 0) {
			timer--;
		}
		if (timer == 0) {
			switch (mySetting) {
				case HIGH:
					myTemperature = Burner.Temperature.BLAZING;
					break;
				case MEDIUM:
					myTemperature = Burner.Temperature.HOT;
					break;
				case LOW:
					myTemperature = Burner.Temperature.WARM;
					break;
				case OFF:
					myTemperature = Burner.Temperature.COLD;
					break;
			}
		}
	}

	public void display() {
		String tempStatus = "";
		switch (this.getMyTemperature()) {
			case COLD:
				tempStatus = "cooool";
				break;
			case WARM:
				tempStatus = "warm";
				break;
			case HOT:
				tempStatus = "CAFEFUL";
				break;
			case BLAZING:
				tempStatus = "VERY HOT! DON'T TOUCH";
				break;
		}
		
		System.out.println("[" + mySetting.toString() + "]....." + tempStatus);
	}
}
