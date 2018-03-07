package zookeeper;

public class Mammal {
	private int energy;
	public Mammal() {
		this.energy = 100;
	}
	public Mammal(int energy) {
		this.energy = energy;
	}
	public displayEnergy() {
		System.out.println("Energy Level: "+this.energy);
	}
}
