import java.io.PrintStream;

public class DateTest {

	public static void main(String[] args) {
		//create PrintStream object
		PrintStream ps = new PrintStream(System.out);
		
		//create date objects
		Date firstDate = new Date(20, 1, 2020);
		Date secondDate = new Date(11, 8, 2017);
		
		//test getter methods and print results
		ps.println(firstDate.getDay());
		ps.println(firstDate.getMonth());
		ps.println(firstDate.getYear());
		
		//test the print method
		secondDate.print(ps);
		
		//test the difference in years method
		ps.println(firstDate.diffInYears(secondDate));
	}

}
