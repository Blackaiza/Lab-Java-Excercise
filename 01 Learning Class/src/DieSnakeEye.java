//DieSnakeEye

public class DieSnakeEye {
	
	public static void main(String[] args) {
		Die die1, die2;
		int rollCount;
		int total;
		
		die1 = new Die();
		die2 = new Die();
		rollCount = 0;
		
		do {
			die1.roll();
			die2.roll();
			
			System.out.println("Your roll is " + die1.getFaceValue() + " " + die2.getFaceValue());
			total = die1.getFaceValue() + die2.getFaceValue();
			
//			total = die1.roll() + die2.roll();
//			System.out.println("Your roll is " + die1.getFaceValue() + " " + die2.getFaceValue());
			
			rollCount++;
			
		}while(total != 2);
		
		System.out.println("It took " + rollCount + " rolls to get snake eyes");
		
		
		
	}
}
