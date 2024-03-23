package BookingRoomExercise;
//Program name : MeetingRoom.java

public class MeetingRoom extends BookingRoom{
	
	int typeOfStay;
	int numOfHour;
	
	public MeetingRoom(String name, int numOfParticipants, int tos, int noh) {
		super(name, numOfParticipants);
		this.typeOfStay = tos;
		this.numOfHour = noh;
	}
	
	public int getNumHour() {
		return numOfHour;
	}
	
	public int getTypeOfStay() {
		return typeOfStay;
	}
	
	public double payment() {
		double totalUp = 0;
		
		if(typeOfStay == 1) {
			totalUp += (numOfHour * 250.0);
		}
		else if(typeOfStay == 2) {
			totalUp += (numOfHour * 150.0);
		}
		
		if(totalUp > 1000.0) {
			totalUp = totalUp * 0.95; 
		}
		
		return totalUp;
	}
}
