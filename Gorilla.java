package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
		this.energyLevel = 200;
	}
	
	public void throwSomething() {	
		System.out.println("Gorilla yeet");
		this.energyLevel -= 5;
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla consumed banana flesh");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.print("Gorilla is getting his ladder");
		this.energyLevel -= 10;
	}
}
k