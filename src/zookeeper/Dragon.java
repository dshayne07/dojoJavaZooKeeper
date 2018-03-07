package zookeeper;

public class Dragon extends Mammal {
	private int energy;
	public Dragon() {
		this.energy = 200;
	}
	public void fly() {
		System.out.println("Woosh! The dragon took flight!");
		this.energy-=50;
	}
	public void eatHumans() {
		System.out.println("Yummy! The dragon feasted on human flesh!");
		this.energy+=25;
	}
	public void attackTown() {
		System.out.println("Boom! The town is on fire!");
		this.energy-=100;
	}
}
