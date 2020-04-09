package model;
import java.util.*;
/**
 * Class Ship
 *
 * Manipulate ship information
 *
 * @author JuanPalta
 */
public class Ship{
	/**CONSTANTS*/
	private final static int MAXCAPACITY=28000;
	
	/**ATRIBUTES*/
	private String captain;
	private String name;
	private Client[] clients = new Client[5];
	private int kilos;
	private ArrayList <Loads> quantityOfLoads = new ArrayList <Loads> ();
	Scanner sc = new Scanner(System.in);

	/**constructor for ship class
	pre:
	pos:build a ship instance
	@param name the name of the ship
	@param captain the name of the captain
	*/
	public Ship(String captain, String name){

		this.captain = captain;
		this.name = name;
		kilos = 0;
	}
	
	/** Set name to the ship
	pre:
	pos: Set name to the ship
	@param name the name of the ship
	*/
	public void setName(String name){
		this.name =name;
	}
	
	/** Get name of the ship
	pre:
	pos: get name of the ship
	@return name
	*/
	public String getName(){

	return name;}
	
	/** Set captain to the ship
	pre:
	pos: Set captain to the ship
	@param captain the name of the captain
	*/
	public void setCaptain(String captain){

	this.captain = captain;}
	
	/** Get captain of the ship
	pre:
	pos: get captain of the ship
	@return captain
	*/
	public String getCaptain(){
	return captain;}

	/** Set weight to the ship
	pre:
	pos: Set weight to the ship
	@param kilos the weight of the ship
	*/
	public void setKilos(int kilos){
	this.kilos = kilos;}

	/** Get weight of the ship
	pre:
	pos: get weight of the ship
	@return kilos
	*/
	public int getKilos(){
	return kilos;}
	
	/** Get the ship clients
	pre:
	pos: get the ship clients
	@return Client[] clients
	*/
	public Client[] getClients(){
	return clients;}
	
	/** Get the loads of the ship
	pre:
	pos: get the loads of the ship
	@return ArrayList quantityOfLoads
	*/
	public ArrayList <Loads> getQuantityOfLoads(){
	return quantityOfLoads;}
	
	/** Get the max capacity of weight of the ship
	pre:
	pos: get the max capacity of weight of the ship
	@return int MAXCAPACITY
	*/
	public int getMaxCapacity(){
	return MAXCAPACITY;}
	
	/** check if the ship can set sail or not
	pre:
	pos: check if the ship can set sail or not
	@return String
	*/
	public String setSail(){
		
		int contador = 0;
		for(int i=0; i<quantityOfLoads.size();i++){
			
			if(quantityOfLoads.get(i) != null){
		contador++;}}
		
		if(kilos>12000 || contador>=2){
		return "Requirements successfully met, you can set sail";}
		
		else{
		return "Requirements are not met successfully, you can not set sail";}
	}
	
}