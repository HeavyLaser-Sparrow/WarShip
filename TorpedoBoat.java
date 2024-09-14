public class TorpedoBoat extends Navy{
	private int numTorpedo;
	private boolean loaded;
	public TorpedoBoat(){
		super(100);
		numTorpedo = 10;
		loaded = false;
	}
	
	public void dock(){
		if(getSea()){
			super.dock(100);
			numTorpedo = 10;
			System.out.println("You have docked and loaded up on supplies");
		} else {
			System.out.println("You are already docked");
		}	
	}

	public void load(){
		if(numTorpedo >= 2){
			numTorpedo -= 2;
			System.out.println("2 torpedo's loaded");
			loaded = true;
		} else {
			System.out.println("Sorry, but you do not have any torpedos left");
		}
	}
	
	public void fire(){
		if(getSea()){
			if(loaded){
				System.out.println("Shooting Torpedo Now");
				loaded = false;
				if(getEnemy()){
					int xPrb = (int)(Math.random() * 10) + 1;
					int yPrb = (int)(Math.random() * 10) + 1;
					if(xPrb > 5 || yPrb > 5){
						System.out.println("You have taken down the enemy!");
						ridEnemy();
					} else {
						System.out.println("You missed...");
						subHealth(30);
						System.out.println("They shot at you!");
					}
				}
			} else {
				System.out.println("Sorry, but you do not have any torpedos loaded");
			}
		} else {
			System.out.println("You are not allowed to shoot torpedos when you are docked");
		}
	}

	public void willPrint(){
		System.out.println("Health: "+getHealth());
		System.out.println("AtSea Status: "+getSea());
		System.out.println("NumTorpedos: "+numTorpedo);
		System.out.println("Loaded: "+loaded);
		System.out.println("Ship Nearby: "+getEnemy());
	}


}
