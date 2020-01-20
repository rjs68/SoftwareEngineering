import java.io.PrintStream;

public class Lop {
	private Person[] people;
	private int peopleIndex = 0; //index to track the current array position
	
	/**
	 * Constructor to initiate the people array
	 */
	public Lop() {
		people = new Person[10];
	}
	
	/**
	 * Method to add a person to the array
	 * @param person
	 */
	public void add(Person person) {
		if(peopleIndex <= 9) {
			people[peopleIndex] = person;
			peopleIndex++; //increment the index counter
		}
	}
	
	/**
	 * Method to remove a person from the array
	 * Note: this index can no longer be used due to program limitations
	 * @param person
	 */
	public void remove(Person person) {
		for(int i=0; i<peopleIndex; i++) {
			if(people[i] == person) {
				people[i] = null;
			}
		}
	}
	
	/**
	 * Method to find a person in the array using their name
	 * @param name
	 * @return Person person or null if none exists
	 */
	public Person find(String name) {
		for(int i=0; i<peopleIndex; i++) {
			if(people[i].getName() == name) {
				return people[i];
			}
		}
		return null;
	}
	
	/**
	 * Method to print the list of people
	 * @param ps
	 */
	public void print(PrintStream ps) {
		for(int i=0; i<peopleIndex; i++) {
			//Don't print if a position is null
			if(people[i] != null) {
				people[i].print(ps);
			}
		}
	}
}
