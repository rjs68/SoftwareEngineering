import java.io.PrintStream;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void print(PrintStream ps) {
		ps.println(day + "/" + month + "/" + year);
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public int diffInYears(Date d) {
		if(month < d.getMonth() ||
				(month == d.getMonth() && day < d.getDay())) {
			return (year - d.getYear() - 1);
		}else {
			return (year - d.getYear());
		}
		
	}
}
