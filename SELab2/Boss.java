import java.io.PrintStream;

public class Boss extends Person{
	LopImproved workers;
	int workerIndex = 0;
	
	/**
	 * Constructor that calls the super constructor and initiates the Lop
	 * @param name
	 * @param dob
	 */
	public Boss(String name, Date dob) {
		super(name, dob);
		workers = new LopImproved();
	}
	
	/**
	 * Method to add a worker to the Lop
	 * @param worker
	 */
	public void addWorker(Worker worker) {
		workers.add(worker);
	}
	
	/**
	 * Method to remove a worker from the Lop
	 * @param worker
	 */
	public void subWorker(Worker worker) {
		workers.remove(worker);
	}
	
	/**
	 * Method to get the next worker from the Lop
	 * @return Worker or null
	 */
	public Worker next() {
		if(workerIndex<workers.getLength()) {
			Worker nextWorker = (Worker) workers.get(workerIndex);
			workerIndex++;
			return nextWorker;
		}else {
			return null;
		}
	}
	
	/**
	 * Method to reset the worker index, to return to the start of the list
	 */
	public void reset() {
		workerIndex = 0;
	}
	
	/**
	 * Method to print the boss and a list of their workers
	 */
	public void print(PrintStream ps) {
		String printString = this.getName() + " bosses: ";
		reset();
		while(workerIndex<workers.getLength()) {
			printString += next().getName() + " ";
		}
		printString += "\n";
		ps.print(printString);
	}
}
