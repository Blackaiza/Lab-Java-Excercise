package BookingRoomExercise;
//Program name : BookingRoomApp.java

import java.util.*;

public class BookingRoomApp {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// User's Name
		String name;
		System.out.print("Input your name: ");
		name = sc.nextLine();
		
		// Number of Participants
		int numOfParticipants;
		System.out.print("Input number of participants: ");
		numOfParticipants = sc.nextInt();
			
		//Type of Room 
		int type;
		System.out.print("Input room type (1-Meeting Room / 2-Conference Room): ");
		type = sc.nextInt();
		
		// Meeting Room
		if(type == 1) {
			
			// Number of Hours
			int hour;
			System.out.print("Input number of hours to book: ");
			hour = sc.nextInt();
			
			// Type of Stay
			int tos;
			System.out.print("Type of booking (1-One off stay / 2-Regular recurring): ");
			tos = sc.nextInt();
			
			MeetingRoom user1 = new MeetingRoom(name, numOfParticipants, tos, hour);
			
			System.out.println("Total payment for the Meeting Room is RM " + user1.payment());
		}
		
		// Conference Room
		else if(type == 2) {
			
			// Type of Package
			int pack;
			System.out.println("Input package type (1-Fullday/2-Halfday): ");
			pack = sc.nextInt();
			
			// Merchandise
			int merc;
			System.out.println("Want to request merchandise? (1-Yes/2-No): ");
			merc = sc.nextInt();
			
			ConferenceRoom user2 = new ConferenceRoom(name, numOfParticipants, pack, merc);
			
			System.out.println("Total payment for the Conference Room is RM " + user2.payment());

		}
		
		
	}
}
