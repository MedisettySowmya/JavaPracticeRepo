package generics;

import java.util.ArrayList;

public class WithGenerics {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("sowmya");
		list.add(2000);
		
		String name = (String) list.get(0); //Ok
		String amount = (String) list.get(1);//  ClassCastException at runtime
		

	}

}
