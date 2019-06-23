
public class Gorilla extends Mammel {
	private int energy = this.getEnergyLevel();
	public void throwSomething() {
		if(energy < 5){
			System.out.println("Not enough energy.");
			return;
		}
		energy -= 5;
		this.setEnergyLevel(energy);
		
	}
	
	public void eatBananas() {
		if(energy >= 90) {
			this.setEnergyLevel(100);
		}else {
			energy += 10;
			this.setEnergyLevel(energy);
		}
	}
	
	public void climb() {
		if(energy < 10) {
			System.out.println("Note enougn energy.");
			return;
		}
		energy -= 10;
		this.setEnergyLevel(energy);
	}
}
