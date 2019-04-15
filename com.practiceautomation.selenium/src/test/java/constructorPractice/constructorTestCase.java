package constructorPractice;

public class constructorTestCase {

	public static void main(String[] args) {
		
        //Passing values to the constructor
		
		ConstructorDeclaration Suzuki = new ConstructorDeclaration("Swift", 2015, true);
		
		Suzuki.iColor = "White";
		Suzuki.iDoors = 4;
		Suzuki.iGear = 5;
		Suzuki.iTyres = 4;
		
		Suzuki.DisplayCharacteristics();

	}

}
