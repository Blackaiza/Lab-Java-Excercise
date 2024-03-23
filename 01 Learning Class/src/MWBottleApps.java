//MWBottleApps

public class MWBottleApps {

	public static void main(String[] args) {
		
		//******IMPORTANT*******UNDERSTAND THIS
		MWBottle bottle1 = new MWBottle("Cactus", 500, "blue");
		MWBottle bottle2 = new MWBottle("Spritzer", 1000, "green");
		
		//*** Let us check ...
		System.out.println("*******************************");
		bottle1.infoBottle();
		System.out.println("*******************************");
		bottle2.infoBottle();
		
		//*** Continue the program here ...
		//**Bottle 1
		System.out.println("*******************************");
		bottle1.closeBottle();
//		bottle1.openBottle();
		bottle1.pourBottle(600);
		bottle1.statusBottle();
		
		//**Bottle 2
		System.out.println("*******************************");
//		bottle2.closeBottle();
		bottle2.openBottle();
		bottle2.pourBottle(600);
		bottle2.statusBottle();

	}
}
