package zookeeper;

public class Gorilla extends Mammal {
	private int energy;

	public Gorilla() {
		super();		
	}
	public Gorilla(int energy) {
		super(energy);
	}
	public void throwSomething() {
		System.out.println("The Gorilla threw something!");
		this.energy-=5;
	}
	public void eatBananas() {
		System.out.println("The Gorilla ate a banana! It is highly satisfied.");
		this.energy+=10;
	}
	public void climb() {
		System.out.println("The Gorilla climbed a tree!");
		this.energy-=10;		
	}
}
