import java.io.PrintStream;

public class Worker extends Person{
	Boss boss;
	
	/**
	 * Constructor that calls the super constructor and sets the boss
	 * @param name
	 * @param dob
	 * @param boss
	 */
	public Worker(String name, Date dob, Boss boss) {
		super(name, dob);
		this.boss = boss;
		boss.addWorker(this);
	}
	
	/**
	 * Method to change the boss of the worker
	 * @param newBoss
	 */
	public void newBoss(Boss newBoss) {
		boss.subWorker(this);
		boss = newBoss;
		boss.addWorker(this);
	}
	
	/**
	 * Method to get the boss of a worker
	 * @return Boss boss
	 */
	public Boss getBoss() {
		return boss;
	}
	
	/**
	 * Method to print the name of the worker
	 */
	public void print(PrintStream ps) {
		ps.print(this.getName());
	}
}
