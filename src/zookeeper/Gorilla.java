package zookeeper;

public class Gorilla {
	private int energy;

	public Gorilla() {
		this.energy = 100;		
	}
	public Gorilla(int energy) {
		this.energy = energy;
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
