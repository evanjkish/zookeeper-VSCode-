package com.codingdojo.zookeeper;

public class GiantBat extends Mammal {
	public GiantBat() {
		super();
		this.energyLevel = 300;
	}
	
	public void attackTown() {	
		System.out.println("*DISTANT SCREAMING*");
		System.out.println("There goes the neighborhood");
		this.energyLevel -= 100;
		
	}
	
	public void consumeFlesh() {
		System.out.println("*CRUNCHING/SQUELCHING*");
		System.out.println("Giant bat consumed...oh the horror");
		this.energyLevel += 25;
	}
	
	public void toSky() {
		System.out.print("*SWOOSH*");
		System.out.println("It ascends!");
		this.energyLevel -= 50;
	}
}
