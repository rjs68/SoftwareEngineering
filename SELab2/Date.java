import java.io.PrintStream;

public class Date {
	private int day;
	private int month;
	private int year;
	
	/**
	 * Constructor to set the day, month and year of the date
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Method to print the date object
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.println(day + "/" + month + "/" + year);
	}
	
	/**
	 * Method to get the day value
	 * @return int day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * Method to get the month value
	 * @return int month
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * Method to get the year value
	 * @return int year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Method to calculate the difference in whole years
	 * @param d
	 * @return
	 */
	public int diffInYears(Date d) {
		if(month < d.getMonth() ||
				(month == d.getMonth() && day < d.getDay())) {
			return (year - d.getYear() - 1);
		}else {
			return (year - d.getYear());
		}
		
	}
}
