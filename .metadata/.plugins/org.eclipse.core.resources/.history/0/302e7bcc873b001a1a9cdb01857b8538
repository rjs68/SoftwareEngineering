import java.io.PrintStream;

public class DateTest {

	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out);
		
		Date firstDate = new Date(20, 1, 2020);
		Date secondDate = new Date(11, 8, 2017);
		
		ps.println(firstDate.getDay());
		ps.println(firstDate.getMonth());
		ps.println(firstDate.getYear());
		
		secondDate.print(ps);
		
		ps.println(firstDate.diffInYears(secondDate));
	}

}
