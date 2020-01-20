import java.io.PrintStream;

public class PersonTest {

	public static void main(String[] args) {
		//Create a PrintStream object
		PrintStream ps = new PrintStream(System.out);
		
		Person donald = new Person("Donald", new Date(2, 1, 1972)); //create a new person
		donald.print(ps); //test the print method
		
		//test the getters and print out the results
		ps.println(donald.getName()); 
		ps.println(donald.getAge());
	}

}
