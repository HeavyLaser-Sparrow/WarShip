import java.util.Scanner;

public class MyProgram{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);	
		TorpedoBoat myBoat = new TorpedoBoat();
		System.out.println("You own a torpedo-boat");
		boolean keepGoing = true;
		while(keepGoing){
			System.out.println();
			myBoat.willPrint();
			System.out.println("Do you want to [d]ock [s]etSail [lo]adTorpedo [f]ireTorpedo [le]ave");
			String choice = input.nextLine();
			if(choice.equals("le")){
				System.out.println("Ok, Bye");
				keepGoing = false;
			} else if(choice.equals("d")){
				myBoat.dock();
			} else if(choice.equals("s")){
				myBoat.setSail();
			} else if(choice.equals("lo")){
				myBoat.load();
			} else if(choice.equals("f")){
				myBoat.fire();
			}
			System.out.println();
			if(myBoat.getHealth() <= 0){
				System.out.println("You have been sunk");
				keepGoing = false;
			}
		}
	}
}
