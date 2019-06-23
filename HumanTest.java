package com.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		
		// Initialize Human objects
		Human heman = new Human();
		Human batman = new Human();
		Human deadpool = new Human();
		
		// Attacking
		heman.attack(batman);
		heman.attack(batman);
		
		batman.attack(heman);

		deadpool.attack(batman);
		deadpool.attack(heman);
		deadpool.attack(batman);

		
		
		// Display final health
		System.out.println("Heman's health: ");
		heman.displayHealth();
		System.out.println("Batman's health: ");
		batman.displayHealth();
		System.out.println("Deadpool's health: ");
		deadpool.displayHealth();
		
	}

}
