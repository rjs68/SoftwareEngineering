import java.io.PrintStream;
import java.time.LocalDate;

public class Person {
	private String name;
	private Date dob;
	
	/**
	 * Constuctor to set the name and date of birth
	 * @param name
	 * @param dob
	 */
	public Person(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}
	
	/**
	 * Method to print the name and dob of the object
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.print(name + ": ");
		dob.print(ps);
	}
	
	/**
	 * Method to get the name of the person
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Method to calculate the current age of the person
	 * @return int age
	 */
	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		int currentDay = currentDate.getDayOfMonth();
		int currentMonth = currentDate.getMonthValue();
		int currentYear = currentDate.getYear();
		Date nowDate = new Date(currentDay, currentMonth, currentYear);
		
		return nowDate.diffInYears(dob);
	}
}
