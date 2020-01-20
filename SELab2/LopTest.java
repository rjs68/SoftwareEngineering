import java.io.PrintStream;

public class LopTest {

	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out);
		
		Lop list = new Lop();
		
		Person john = new Person("John", new Date(11, 8, 2017));
		Person fred = new Person("Fred", new Date(21, 3, 1983));
		Person julia = new Person("Julia", new Date(30, 2, 1943));
		Person annie = new Person("Annie", new Date(2, 12, 1999));
		
		list.add(john);
		list.add(fred);
		list.add(julia);
		list.add(annie);
		
		list.print(ps);
		
		list.remove(julia);
		list.print(ps);
		
		list.find("John").print(ps);
	}

}
