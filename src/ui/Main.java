package ui;
import java.util.*;
import model.*;


public class Main{
	
	public static Menu application = new Menu();
	public static Ship morgan = new Ship("Morgan","Pirata");
	
public static void main (String[] args){
	
	
	application.addClients();
	
	application.showMenu();

}

}

	




	
