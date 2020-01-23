//Authors: Ethan Perry and Shania Jo RunningRabit

/*
 * The PublicSafety class will contain the stations and 
 * will tell stations when they should hire another detective.
 */
public class PublicSafety {
	private Station universityStation;
	private Station cityStation;
	
	
	public PublicSafety(String us, String cs) {
		this.universityStation = new Station(us);
		this.cityStation = new Station(cs);
	}
	
	//Hiring will take place at the requested station.
	public void doHire(boolean city) {
		if(city) {
			cityStation.hire();
		} else {
			universityStation.hire();
		}
	}

	public void printDetectiveLists() {
		universityStation.printDetectives();
		cityStation.printDetectives();
	}
}
