import java.io.PrintStream;
import java.time.LocalDate;

public class Person {
	private String name;
	private Date dob;
	
	public Person(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}
	
	public void print(PrintStream ps) {
		ps.print(name + ": ");
		dob.print(ps);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		int currentDay = currentDate.getDayOfMonth();
		int currentMonth = currentDate.getMonthValue();
		int currentYear = currentDate.getYear();
		Date nowDate = new Date(currentDay, currentMonth, currentYear);
		
		return nowDate.diffInYears(dob);
	}
}
