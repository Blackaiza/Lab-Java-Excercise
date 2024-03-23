//DieRolling Case

public class DieRolling {

	public static void main(String[] args) {
		
		int N = 1000;
		
		Die die = new Die();
		
		int[] face = new int[7];
		int x = 0;
		
		for(int i = 0; i < N; i++) {
			x = die.roll();
			face[x]++;
		}
		
		for (int i = 1; i <= 6; i++) {
			System.out.println(i + ": " + face[i] + " " + (double)face[i]/N);
			
		}
		
	}
}
