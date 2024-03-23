package BookingRoomExercise;
//Program name : ConferenceRoom.java

public class ConferenceRoom extends BookingRoom{

	int typeOfPackage;
	int merchandise;
	
	public ConferenceRoom(String name, int numOfParticipants, int top, int mer) {
		super(name, numOfParticipants);
		this.typeOfPackage = top;
		this.merchandise = mer;
	}
	
	public double payment() {
		double totalUp = 0;
		
		if(typeOfPackage == 1) {
			totalUp += 4500;
		}
		else if(typeOfPackage == 2) {
			totalUp += 3000;
		}
		
		if(merchandise == 1) {
			return totalUp += (numOfParticipants * 10);
		}
		else if(merchandise == 2){
			return totalUp;
		}
		return totalUp;
		
		
	}
}
