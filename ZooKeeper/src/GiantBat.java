
public class GiantBat extends Mammel {
	private int energy = 300;
	
	public void fly() {
		if(energy < 50){
			System.out.println("*Thud* The bat crashes, not having enough energy to fly.");
			return;
		}
		System.out.println("*Fooosh* The bat extends it's wings and takes to the air.");
		energy -= 50;
		this.setEnergyLevel(energy);	
	}
	
	public void attackTown() {
		if(energy < 100){
			System.out.println("*ZzZz* The bat falls asleep on the way to town.");
			return;
		}
		System.out.println("*Crash* The bat lands on a hut roof, beginning it's attack.");
		energy -= 100;
		this.setEnergyLevel(energy);
	}
	
	public void eatHumans() {
		energy += 25;
		if(energy > 300){
			energy = 300;

		}
		System.out.println("*Munch* ....you don't want to know.");
		this.setEnergyLevel(energy);
	}
}
