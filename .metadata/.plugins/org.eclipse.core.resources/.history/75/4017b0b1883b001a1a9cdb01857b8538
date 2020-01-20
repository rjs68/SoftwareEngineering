import java.io.PrintStream;

public class Lop {
	private Person[] people;
	private int peopleIndex = 0;
	
	public Lop() {
		people = new Person[10];
	}
	
	public void add(Person person) {
		if(peopleIndex <= 9) {
			people[peopleIndex] = person;
			peopleIndex++;
		}
	}
	
	public void remove(Person person) {
		for(int i=0; i<peopleIndex; i++) {
			if(people[i] == person) {
				people[i] = null;
			}
		}
	}
	
	public Person find(String name) {
		for(int i=0; i<peopleIndex; i++) {
			if(people[i].getName() == name) {
				return people[i];
			}
		}
		return null;
	}
	
	public void print(PrintStream ps) {
		for(int i=0; i<peopleIndex; i++) {
			if(people[i] != null) {
				people[i].print(ps);
			}
		}
	}
}
