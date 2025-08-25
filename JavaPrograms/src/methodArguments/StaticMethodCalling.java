package methodArguments;

public class StaticMethodCalling {

	// Static nested inner class
	public static class superclass {

		// Method of inner class
		static void staticMethod() {

			System.out.println("staticMethod() in superclass is called");
		}

		void nonStaticMethod() {
			System.out.println("Non static method of SuperClass");
		}
	}

	// Static nested inner class
	public static class subclass extends superclass {

		// Method of inner class
		static void staticMethod() {

			System.out.println("staticMethod() in subclass is called");
		}
		@Override
		void nonStaticMethod() {
			System.out.println("Non static method of Subclass");
		}

	}

	public static void main(String[] args) {

		// Creating objects of static inner classes
		superclass A = new superclass();
		superclass B = new subclass();
		subclass bref = new subclass();

		// Calling method over above objects
		A.staticMethod();
		B.staticMethod();
		bref.staticMethod();
		
		A.nonStaticMethod();
		B.nonStaticMethod();
		bref.nonStaticMethod();
	}

}
