package constructorPractice;

public class ConstructorDeclaration {

	String iModel;
	int iGear;
	int iTyres;
	int iMake;
	Boolean iLeftHand;
	String iColor;
	int iDoors;
	
	

public ConstructorDeclaration (String Model, int Make, boolean LeftHand) {
	iModel = Model;
	iMake = Make;
	iLeftHand = LeftHand;
	
	}

	public void DisplayCharacteristics() {
		System.out.println("The Model of the car is " + iModel);
		System.out.println("The No. of Gears in the car are " + iGear);
		System.out.println("The No. of tyres in the car are " + iTyres);
		System.out.println("The Make of the car is " + iMake);
		System.out.println("The Color of the car is " + iColor);
		System.out.println("The No. of Doors in the car are " + iDoors);
	}

}
