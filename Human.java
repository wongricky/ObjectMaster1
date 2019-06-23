package com.objectmaster;
import java.lang.Class;

public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public void attack(Human player) {
		player.health -= this.strength;
		System.out.println("Someone was attacked!");
	}
	
	public void displayHealth() {
		System.out.println(health);
	}
}
