
public class Burner {
	private enum Temperature { BLAZING, HOT, WARM, COLD };
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	private static final int TIME_DURATION = 2;
	
	public Temperature getMyTemperature() {
		return myTemperature;
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
		}
		timer += TIME_DURATION;
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
		}
		timer += TIME_DURATION;
	}
	
	public void updateTemperature() {
		if (timer == 0) {
			switch (mySetting) {
			case HIGH:
				myTemperature = Setting.LOW;
				break;
			case MEDIUM:
				mySetting = Setting.LOW;
				break;
			case LOW:
				mySetting = Setting.OFF;
				break;
		}
		} else {
			timer--;
		}
	}

	public void display() {
		System.out.println(mySetting.toString());
	}
}
