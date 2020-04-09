package model;
/**
 * Class Date
 *
 * Manipulate Date information
 *
 * @author JuanPalta
 */
	public class Date{
		
		/**ATRIBUTES*/
		private int day;
		private int month;
		private int year;
		
		/**constructor for date class
	pre:
	pos:build a date instance
	@param day the day of the expedation date
	@param month the month of the expedation date
	@param year the year of the expedation date
	*/
		public Date(int day, int month, int year){
			this.day=day;
			this.month = month;
			this.year = year;
		}
		
		/** Set day of the date
	pre:
	pos: Set day of the date
	@param day the day of the expedation date
	*/
		public void setDay(int day){
		this.day=day;
		}
		
		/** Get day of the date
	pre:
	pos: get day of the date
	@return int day
	*/
		public int getDay(){
			return day;
		}
		
		/** Set month of the date
	pre:
	pos: Set month of the date
	@param month the month of the expedation date
	*/
		public void setMonth(int month){
			this.month = month;
		}
		
		/** Get month of the date
	pre:
	pos: get month of the date
	@return int month
	*/
		public int getMonth(){
			return month;
		}
		
		/** Set year of the date
	pre:
	pos: Set year of the date
	@param year the year of the expedation date
	*/
		public void setYear(int year){
			this.year = year;
		}
		
		/** Get year of the date
	pre:
	pos: get year of the date
	@return int year
	*/
		public int getYear(){
			return year;
		}
		
		
	}