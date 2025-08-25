package methodArguments;

public class Dispatch {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		a.method();
		b.method();
		c.method();
		ClassA aref = new ClassB();
		ClassB bref = new ClassC();
		ClassA acref = new ClassC();

		aref.method();
		bref.method();
		
		System.out.println(aref.x);
	}

}
