package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String name=JOptionPane.showInputDialog("Dear user, please enter your name into the box below!");
String pet= JOptionPane.showInputDialog("Okay, " +name+ ". What pet would you like to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your " +pet+ " happy?" , "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Cuddle", "Play", "feed" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	cuddle () ; 
}
if (task==1) {
	feed () ; 
}
if (task==2) {
	play () ; 
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	if (happinessLevel>6) {
		JOptionPane.showMessageDialog(null, "Wow " +name+ ", you must really love your " +pet+ "!" );
for (int zzx=0; zzx>0; zzx++) {
	break;
}
	}

	
	
	
	
	
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static void cuddle () {
	happinessLevel= happinessLevel +7;
}
static void feed () {
	happinessLevel= happinessLevel +3;
}
static void play () {
	happinessLevel= happinessLevel +6;
}




















}



