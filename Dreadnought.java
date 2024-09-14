public class Dreadnought extends Navy{
	private int numShells;
	private boolean loaded;
	public Dreadnought(){
		super(1000);
		loaded = false;
		numShells = 50;
	}
	
	public void dock(){
		if(getSea()){
			super.dock(1000);
			numShells = 50;
			System.out.println("You have docked and loaded up on supplies");
		} else {
			System.out.println("You are already docked");
		}
	}

	public void load(){
		numShells -= 5;
		System.out.println("5 shells loaded");
		loaded = true;
	}
	
	public void fire(){
		if(getSea()){
			if(loaded){ 
				System.out.println("You have fired your salvo");
				if(getEnemy()){
					int aPrb = (int)(Math.random() * 10) + 1;
					int bPrb = (int)(Math.random() * 10) + 1;
					int cPrb = (int)(Math.random() * 10) + 1;
					int dPrb = (int)(Math.random() * 10) + 1;
					int ePrb = (int)(Math.random() * 10) + 1;
					if(aPrb > 7 || bPrb > 7 || cPrb > 7 || dPrb > 7 || ePrb > 7){
						ridEnemy();
						System.out.println("You have taken out the enemy!");
					} else {
						System.out.println("You missed...");
						subHealth(30);
						System.out.println("They shot at you!");
					}
				}
			}
		} else {
			System.out.println("You are not allowed to fire shells while docked");
		}
	}

	public void willPrint(){
		System.out.println("Health: "+getHealth());
		System.out.println("AtSea Status: "+getSea());
		System.out.println("NumShells: "+numShells);
		System.out.println("Loaded: "+loaded);
		System.out.println("Ship Nearby: "+getEnemy());
	}

	

}
