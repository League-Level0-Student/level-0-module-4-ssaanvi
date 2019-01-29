package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String name =JOptionPane.showInputDialog("Dear user, what is your name?");
JOptionPane.showMessageDialog(null,"Okay, " +name+ ". Have you ever had a pocket full of change? Do you hate doing math. Well, this is a program that calcucates your change without your brain actually doing any work!! Yippie!!");
String nickels = JOptionPane.showInputDialog("Come on, " +name+ ". Lets stop beating about the bush. First question : How many nickels do you have. Enter your answer in the box below.");
		// Convert their answer to an int using Integer.parseInt()
int nic = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("Next question, " +name+ ". How many dimes to you have? Enter your answer into the box below.");
int dime = Integer.parseInt(dimes);

		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog("Final question, " +name+ ". How many quarters do you have. Enter your answer in the box below.");
int quarter = Integer.parseInt(quarters);

		// Calculate how much money the user has and save it in a double variable
double money = (nic * 0.05)+(dime * 0.1)+(quarter * 0.25) ;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "We are done! You have " +money+ " dollars, " +name+ "!! Have a good rest of your day!!");
	}
}

