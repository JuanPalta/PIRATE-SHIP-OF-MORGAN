package ui;
import java.util.Scanner;
import model.*;

/**
 * Class Menu
 *
 * Show a menu
 *
 * @author JuanPalta
 */
public class Menu{
	
	/**CONSTANST */
	private final static int DETERMINATE_CLIENTS = 1;
	private final static int LOAD_SHIP = 2;
	private final static int UNLOAD_SHIP = 3;
	private final static int SHIP_WEIGHT = 4;
	private final static int UPGRADE_CLIENT =5;
	private final static int SET_SAIL = 6;
	private final static int EXIT=7;
	
	/**VARIABLES*/
	private int option;
	Scanner sc = new Scanner(System.in);
	
	/**Constructor of the class Menu */
	public Menu(){
		
		
	}
	
	/** add five clients to the ship
	pre:
	pos: add five clients to the ship
	*/
		public void addClients(){


		for(int i=0;i<Main.morgan.getClients().length;i++){

		System.out.println("Insert the name of the client number " + (i+1));
		String name = sc.nextLine();
		System.out.println("Insert the number of registration of the client number " + (i+1));
		int registration = sc.nextInt();
		sc.nextLine();
		System.out.println("Insert the day of expedation date of the client number " + (i+1));
		int dayclient = sc.nextInt();
		sc.nextLine();
		System.out.println("Insert the month of expedation date of the client number " + (i+1));
		int monthclient = sc.nextInt();
		sc.nextLine();
		System.out.println("Insert the year of expedation date of the client number " + (i+1));
		int yearclient = sc.nextInt();
		sc.nextLine();
		Date clientexpedation = new Date (dayclient,monthclient,yearclient);

		Main.morgan.getClients()[i] = new Client(name,registration,clientexpedation);

		}

	}
	
	/** add loads to the ship
	pre:
	pos: add loads to the ship
	*/
	public void addLoads(){

		System.out.println("Insert quantity of box");
		int boxes = sc.nextInt();
		System.out.println("Insert weight per box in grams");
		int weightbox = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert type of load : HAZARDOUS,PERISHABLE OR NONPERISHABLE");
		String typeload = sc.nextLine();
		System.out.println("Insert client : use the position of the client");
		int position = sc.nextInt();
		Client clientload = Main.morgan.getClients()[position-1];
		sc.nextLine();
		int contador = 0;
		int contador2 = 0;

		for (int i=0;i<Main.morgan.getQuantityOfLoads().size();i++){

			if(Main.morgan.getQuantityOfLoads().get(i).getTypeOfLoad().equalsIgnoreCase("perishable")){

			contador++;

			}

			if(Main.morgan.getQuantityOfLoads().get(i).getTypeOfLoad().equalsIgnoreCase("hazardous")){

			contador2++;

			}

			}

		if(contador >=1 && typeload.equalsIgnoreCase("hazardous")){

		System.out.println("Your load could not be entered because there is a perishable type load on the ship");}

		else if(contador2 >=1 && typeload.equalsIgnoreCase("perishable")){

		System.out.println("Your load could not be entered because there is a hazardous type load on the ship");

		}
		
		else if(typeload.equalsIgnoreCase("hazardous") == false || typeload.equalsIgnoreCase("hazardous") == false || typeload.equalsIgnoreCase("hazardous") == false){
		System.out.println();
		System.out.println("Your load could not be entered because you insert a invalid type");}
		
		else if( Main.morgan.getKilos() + ((weightbox*boxes)/1000) > Main.morgan.getMaxCapacity()){

			System.out.println("The load could not be added because it exceeds 28000 kilos");
		}

		else  {


		Main.morgan.getQuantityOfLoads().add( new Loads(boxes,weightbox,typeload,clientload));
		Main.morgan.setKilos(Main.morgan.getKilos() + (weightbox*boxes)/1000);
		
		Main.morgan.getClients()[position-1].setValueLoad(Main.morgan.getQuantityOfLoads().get(Main.morgan.getQuantityOfLoads().size()-1 ).calculateValue() + Main.morgan.getClients()[position-1].getValueLoad() );
		Main.morgan.getClients()[position-1].setTotalValue(Main.morgan.getQuantityOfLoads().get(Main.morgan.getQuantityOfLoads().size()-1 ).calculateValue() + Main.morgan.getClients()[position-1].getTotalValue() );
		
		System.out.println("The total price to be paid by the client is " + Main.morgan.getClients()[position-1].getValueLoad());
		}
	}
	
	
	
	
	/** unload the ship
	pre:
	pos: unload the ship
	*/
	public void unloadShip(){
		
		Main.morgan.setKilos(0);
		for(int i= Main.morgan.getQuantityOfLoads().size()-1; i>=0;i--){
			
			Main.morgan.getQuantityOfLoads().remove(i);
			
		}
		
		for(int i= Main.morgan.getClients().length-1; i>=0;i--){
			
			Main.morgan.getClients()[i].setValueLoad(0);
			
		}
}

	/** Show the menu of the application
	pre:
	pos: Show the menu of the application
	*/
	public void showMenu(){
		
		
		while(option!= EXIT){
		
		System.out.println();
		System.out.println("WELCOME TO THE MORGAN APPLICATION, CHOSEE YOUR OPTION" +  "\n 1:DETERMINATE CLIENTS" +  "\n 2:LOAD THE SHIP " + "\n 3:UNLOAD THE SHIP" + "\n 4:SHIP WEIGHT" + "\n 5:UPGRADE CLIENT" +
			"\n 6:SET SAIL" + "\n 7:EXIT" );
			
		option = sc.nextInt();
		
		
		
		
		
		switch(option){
			
			case DETERMINATE_CLIENTS:
				System.out.println();
				addClients();
				System.out.println();
				break;
			case LOAD_SHIP:
				System.out.println();
				for(int i=0; i<Main.morgan.getClients().length;i++){
			
			System.out.println("Position " + (i+1) + " is " + Main.morgan.getClients()[i].getName());
		}		
				System.out.println();
				addLoads();
				System.out.println();
				break;
			case UNLOAD_SHIP:
				unloadShip();
				break;
			case SHIP_WEIGHT:
				System.out.println();
				System.out.println("THE WEIGHT OF THE SHIP IS " + Main.morgan.getKilos() + "KG");
				System.out.println();
				break;
			case UPGRADE_CLIENT:
				System.out.println();
				for(int i=0; i<Main.morgan.getClients().length;i++){
			
			System.out.println("Position " + (i+1) + " is " + Main.morgan.getClients()[i].getName());
		}
				System.out.println();
				System.out.println("Insert the position of the client to upgrade");
				int pupgrade = sc.nextInt();
				Main.morgan.getClients()[pupgrade-1].increaseType();
				System.out.println("Enjoy you were promoted to " + Main.morgan.getClients()[pupgrade-1].getType() );
				System.out.println();
				break;
			case SET_SAIL:
				System.out.println();
				System.out.println(Main.morgan.setSail());
				System.out.println();
				break;
			case EXIT:
				System.out.println();
				System.out.println("Thanks for preferring Morgan");
				break;
			default:
				System.out.println();
				System.out.println("Insert a valid option");			
			
			
		}
	


	}


}
}