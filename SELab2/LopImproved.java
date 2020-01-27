
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class LopImproved {
	private List<Person> people;
	
	/**
	 * Constructor to initiate the people array
	 */
	public LopImproved() {
		people = new ArrayList<Person>();
	}
	
	/**
	 * Method to add a person to the array
	 * @param person
	 */
	public void add(Person person) {
		people.add(person);
	}
	
	/**
	 * Method to remove a person from the array
	 * Note: this index can no longer be used due to program limitations
	 * @param person
	 */
	public void remove(Person person) {
		people.remove(person);
	}
	
	/**
	 * Method to find a person in the array using their name
	 * @param name
	 * @return Person person or null if none exists
	 */
	public Person find(String name) {
		for(int i=0; i<people.size(); i++) {
			if(people.get(i).getName() == name) {
				return people.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Method to print the list of people
	 * @param ps
	 */
	public void print(PrintStream ps) {
		for(int i=0; i<people.size(); i++) {
			people.get(i).print(ps);
		}
	}
	
	/**
	 * Method to return the Person at a specified index
	 * @param personIndex
	 * @return Person person
	 */
	public Person get(int personIndex) {
		return people.get(personIndex);
	}
	
	/**
	 * Method to retrieved the length of the person list
	 * @return
	 */
	public int getLength() {
		return people.size();
	}
}
