package model;
import java.util.*;
/**
 * Class Client
 *
 * Manipulate Client information
 *
 * @author JuanPalta
 */
public class Client{
	
	/** CONSTANTS */
	private final static double NORMAL_TYPE = 0;
	private final static double SILVER_TYPE = 0.015;
	private final static double GOLD_TYPE = 0.03;
	private final static double PLATINUM_TYPE=0.05;
	
	/**ATRIBUTES*/
	private String name;
	private int registration;
	private String type;
	private Date expeditionDate;
	private int quantityOfKilos;
	private int totalValue;
	private int valueLoad;
	
	/**constructor for client class
	pre:
	pos:build a client instance
	@param name the name of the client
	@param registration the number registration
	@param expeditionDate the expedition date
	*/
	public Client(String name, int registration , Date expeditionDate){
		
		this.name = name;
		this.registration = registration;
		this.type = "Normal";
		quantityOfKilos = 0;
		this.expeditionDate = expeditionDate;
		totalValue=0;
		valueLoad = 0;
			
	}
	
	/** Set a name to the client
	pre:
	pos: Set a name to the client
	@param name the name of the client
	*/
	public void setName(String name){
	this.name = name;}
	
	/** Get a name to the client
	pre:
	pos: get a name to the client
	@return String name
	*/
	
	public String getName(){
	return name;}
	
	/** Set a registration number to the client
	pre:
	pos: Set a registration number to the client
	@param registration the number of registration
	*/
	public void setRegistration( int registration){
	this.registration=registration;}
	
	/** Get a registration number to the client
	pre:
	pos: get a registration number to the client
	@return int registration
	*/
	
	public int getRegistration(){
		return registration;
	}
	
	/** Set a type to the client
	pre:
	pos: Set a type to the client
	@param type the category of the client
	*/
	
	public void setType(String type){
		this.type = type;
}
	
	/** Get a type to the client
	pre:
	pos: get a type to the client
	@return String type
	*/
	public String getType(){
	return type;
	}
	
	/** Set a quantity of kilos to the client
	pre:
	pos: Set a quantity of kilos to the client
	@param quantityOfKilos the quantity of kilos of the client
	*/
	public void setQuantityOfKilos(int quantityOfKilos){
		this.quantityOfKilos = quantityOfKilos;
	}
	
	/** Get a quantity of kilos to the client
	pre:
	pos: get a quantity of kilos to the client
	@return int quantityOfKilos
	*/
	public int getQuantityOfKilos(){
		return quantityOfKilos;
	}
	
	/** Set a total value to the client
	pre:
	pos: Set a quantity of kilos to the client
	@param totalValue total price paid
	*/
	public void setTotalValue(int totalValue){
		this.totalValue = totalValue;
	}
	
	/** Get a total value to the client
	pre:
	pos: get a total value to the client
	@return int totalValue
	*/
	public int getTotalValue(){
		return totalValue;
	}
	
	/** Set a value of load to the client
	pre:
	pos: Set a value of load to the client
	@param valueLoad the price of the load
	*/
	public void setValueLoad(int valueLoad){
		this.valueLoad = valueLoad;
	}
	
	/** Get a value of load to the client
	pre:
	pos: get a value of load to the client
	@return int valueLoad
	*/
	public int getValueLoad(){
		return valueLoad;
	}
	
	/** Get a expedition date  to the client
	pre:
	pos: get a expedition date to the client
	@return Date expeditionDate
	*/
	public Date getDate(){
		
	return expeditionDate;}
	
	
	/** Set a expedition date to the client
	pre:
	pos: Set a expedition date to the client
	@param  day the day of the expedition date
	@param  month the month of the expedition date
	@param  year the year of the expedition date
	*/
	public void setDate(int day, int month, int year){
		
		expeditionDate = new Date(day,month,year);
		
	}
	
	/** verify the type of the client and promote it
	pre:
	pos: increase the type of the client
	*/
	public void increaseType(){
		if(quantityOfKilos>=350000){
			type ="SILVER";
		}
		
		if(quantityOfKilos>=550000 || totalValue >=2000000 & totalValue<5000000){
			
			type = "GOLD";
		}
		
		if(totalValue>=5000000){
			
			type = "PLATINUM";
		}
	
}
}