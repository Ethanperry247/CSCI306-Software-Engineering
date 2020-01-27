// Authors: Ethan Perry and Shania Jo RunningRabbit

public class Burner {
	// Can I make this public?
	public enum Temperature { BLAZING, HOT, WARM, COLD };
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	private static final int TIME_DURATION = 2;
	
	public Burner() {
		myTemperature = Burner.Temperature.COLD;
		mySetting = Setting.OFF;
		timer = 0;
	}
	
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	//Increases the burner setting by one.
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
	
	// Decreases the burner setting by one.
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
		
		// Updates temperature if the timer has hit zero.
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
		// Generates a string describing the temperature of the stove to de displayed.
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
		
		// Prints both status and temperature indicators.
		System.out.println("[" + mySetting.toString() + "]....." + tempStatus);
	}
}
