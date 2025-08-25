package generics;

import java.util.ArrayList;

public class WithoutGenerics {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("sowmya");
		list.add(172);
		String name =(String) list.get(0); //Ok
		//String id = (String)list.get(1); //runtime error

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("sowmya");
		//list2.add(2000); //compile time error
		String name2 = list2.get(0); //Ok
        System.out.println(name2);

		

	}

}
