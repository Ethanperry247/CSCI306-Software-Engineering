//Authors: Ethan Perry and Shania Jo RunningRabit

import java.util.Scanner;

/* 
 * The Station class will maintain data related to one station, 
 * specifically the name of the station (e.g., "Golden") and the 
 * list of detectives.
 */
public class Station {
	public final int MAX_DETECTIVES = 5;
	public static int badgeNumber = 0;
	private Detective[] detectives = new Detective[MAX_DETECTIVES];
	private int currentDetectives = 0;
	private String stationName;
	
	public Station(String stationName) {
		this.stationName = stationName;
	}
	
	//If the max number of detectives have been hired, no new detectives will be hired.
	//Otherwise, a new detective will be hired by asking for user input of its name.
	public void hire() {
		if (currentDetectives < MAX_DETECTIVES) {
			Scanner input = new Scanner(System.in);
			System.out.print("New hire for " + stationName + "...Enter detective's name: ");
			String name = input.nextLine();
			Detective detective = new Detective(name, badgeNumber);
			detectives[currentDetectives] = detective;
			badgeNumber++;
			currentDetectives++;
		} else {
			System.out.println("Can't hire any more detectives for " + stationName);
		}
	}
	
	//Loops through and prints all detectives from the station.
	public void printDetectives() {
		System.out.println("List of Detectives for " + stationName);
		for (Detective detective: detectives) {
			//Checks for empty detective slots, as to not print out null.
			if (detective != null) {
				System.out.println(detective);
			}
		}
		System.out.println();
		
	}
}
