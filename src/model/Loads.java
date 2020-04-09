package model;
import java.util.*;
/**
 * Class Loads
 *
 * Manipulate Load information
 *
 * @author JuanPalta
 */
public class Loads{
	/**CONSTANTS*/
	private final static int PERISHABLE=250000;
	private final static int NONPERISHABLE=80000;
	private final static int HAZARDOUS=390000;
	
	/**ATRIBUTES*/
	private int quantityOfBox;
	private int weightPerBox; // THE WEIGHT IS IN GRAMS
	private String typeOfLoad;
	private int valueOfLoad;
	private Client client;	
	
	/**constructor for load class
	pre:
	pos:build a load instance
	@param quantityOfBox the quantity of boxes
	@param weightPerBox the weight per box
	@param typeOfLoad the type of the load
	@param client the client of the load
	*/
	public Loads(int quantityOfBox, int weightPerBox, String typeOfLoad , Client client){
		
		this.quantityOfBox=quantityOfBox;
		this.weightPerBox=weightPerBox;
		this.typeOfLoad=typeOfLoad;
		this.client = client;
		
	}
	
	/** Set quantity Of Box of the load
	pre:
	pos: Set quantity Of Box of the load
	@param quantityOfBox the quantity of the boxes
	*/
	public void setQuantityOfBox(int quantityOfBox){
	this.quantityOfBox = quantityOfBox;
	}
	
	/** Get quantity of box of the load
	pre:
	pos: get quantity of box of the load
	@return int quantityOfBox
	*/
	public int getQuantityOfBox(){
		return quantityOfBox;
	}
	
	/** Set weight per box of the load
	pre:
	pos: Set weight per box of the load
	@param weightPerBox the weight per box
	*/
	public void setWeightPerBox(int weightPerBox){
		this.weightPerBox = weightPerBox;
	}
	
	/** Get weight per box of the load
	pre:
	pos: get weight per box of the load
	@return int weightPerBox
	*/
	public int getWeightPerBox(){
		return weightPerBox;
	}
	
	/** Set type of the load
	pre:
	pos: Set type of the load
	@param typeOfLoad the type of the load
	*/
	public void setTypeOfLoad(String typeOfLoad){
		this.typeOfLoad = typeOfLoad;
	}
	
	/** Get type of the load
	pre:
	pos: get type of the load
	@return String typeOfLoad
	*/
	public String getTypeOfLoad(){
		return typeOfLoad;
	}
	
	/** Set a client of the load
	pre:
	pos: Set a client of the load
	@param client the client of the load
	*/
	public void setClient(Client client){
	this.client = client;
	}
	
	/** Get a client of the load
	pre:
	pos: get a client of the load
	@return Client client
	*/
	public Client getClient(){
		return client;
	}
	
	/** Get value of type of the load
	pre:
	pos: get value of type of the load
	@return int
	*/
	public int getValueOfType(){
		
		if(getTypeOfLoad().equalsIgnoreCase("PERISHABLE")){
		return PERISHABLE;}
		
		if(getTypeOfLoad().equalsIgnoreCase("NONPERISHABLE")){
		return NONPERISHABLE;}
		
		if(getTypeOfLoad().equalsIgnoreCase("HAZARDOUS")){
		return HAZARDOUS;}
		
		else {
			return 0;
	}
		
	}
	
	/** Calculate the value of the load
	pre:
	pos: Calculate the value of the load
	@return int valueOfLoad
	*/
	public int calculateValue(){
		
		int grams = weightPerBox*quantityOfBox;
		valueOfLoad = 0;
		
		while(grams>=1000){
			
			valueOfLoad+=getValueOfType();
			grams -=1000;
		}
		
		while(grams>=500){
			
			valueOfLoad+=getValueOfType()/2;
			grams -=500;
		}
		
		while(grams>=250){
			
			valueOfLoad=getValueOfType()/4;
			grams -=250;
		}
		
		while(grams>=125){
			
			valueOfLoad+=getValueOfType()/8;
			grams -=125;
		}
		
		while(grams>=100){
			
			valueOfLoad+=getValueOfType()/10;
			grams -=100;
		}
		
		while(grams>=50){
			
			valueOfLoad+=getValueOfType()/20;
			grams -=50;
		}
		
		while(grams>=25){
			
			valueOfLoad+=getValueOfType()/40;
			grams -=25;
		}
		
		while(grams>=20){
			
			valueOfLoad+=getValueOfType()/50;
			grams -=20;
		}
		while(grams>=10){
			
			valueOfLoad+=getValueOfType()/100;
			grams -=10;
		}
		
		while(grams>=5){
			
			valueOfLoad+=getValueOfType()/200;
			grams -=5;
		}
		
		while(grams>=1){
			
			valueOfLoad+=getValueOfType()/1000;
			grams -=1;
		}
		
	if(client.getType().equalsIgnoreCase("SILVER") & typeOfLoad.equalsIgnoreCase("PERISHABLE")){
		
		valueOfLoad = (int)valueOfLoad - (int)(valueOfLoad*0.015);
	}
	
	else if(client.getType().equalsIgnoreCase("GOLD") & typeOfLoad.equalsIgnoreCase("PERISHABLE") || client.getType().equalsIgnoreCase("GOLD") & typeOfLoad.equalsIgnoreCase("NONPERISHABLE")  ){
		
		valueOfLoad = (int)valueOfLoad - (int)(valueOfLoad*0.03);
	}
	
	else if(client.getType().equalsIgnoreCase("PLATINUM")){
		
		valueOfLoad = (int)valueOfLoad - (int)(valueOfLoad*0.05);
	}
	
	else {
		
	valueOfLoad = valueOfLoad;}
	
	return valueOfLoad;
	
	}
}
