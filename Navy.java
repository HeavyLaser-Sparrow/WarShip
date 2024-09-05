public class Navy{
	private boolean atSea;
	private int health;
	private boolean enemy;
	
	public Navy(int asdf){
		atSea = false;
		health = asdf;
		enemy = false;
	}
	

	public void setSail(){
		atSea = true;
		System.out.println("Setting Sail Now");
	
	    int prb = (int)(Math.random() * 10) + 1; // 1-10
		if(prb > 3){
			enemy = true;
			System.out.println("Oh no! An enemy approaches.");
			System.out.println("SHOOT THEM!!!!");
		}
	}
	public void dock(int max){
		if(atSea){
			System.out.println("Docking Now");
			atSea = false;
			health = max;
			enemy = false;
		} else {
			System.out.println("You are already at a dock");
		}
		
		 
	
	}	
	public boolean getSea(){return atSea;}
	public int getHealth(){return health;}
	public boolean getEnemy(){return enemy;}
	public void subHealth(int x){
		health -= x;
	}
	public void ridEnemy(){enemy = false;}

}
