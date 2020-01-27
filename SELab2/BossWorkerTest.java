import java.io.PrintStream;

public class BossWorkerTest {

	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out);

		Boss hugh = new Boss("Hugh", new Date(12, 2, 1957));
		Boss kate = new Boss("Kate", new Date(28, 5, 1958));
		
		Worker nathan = new Worker("Nathan", new Date(8, 3, 1969), hugh);
		Worker gareth = new Worker("Gareth", new Date(18, 9, 2000), hugh);
		Worker meredith = new Worker("Meredith", new Date(30, 5, 1999), kate);
		Worker julia = new Worker("Julia", new Date(7, 2, 1998), kate);
		Worker liam = new Worker("Liam", new Date(21, 6, 1973), kate);
		
		hugh.print(ps);
		kate.print(ps);
		
		nathan.newBoss(kate);
		
		hugh.print(ps);
		kate.print(ps);
	}

}
