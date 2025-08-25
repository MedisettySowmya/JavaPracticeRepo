package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {
	 public static void main(String args[])
	 {
		 List<String> names = new ArrayList();
		 names.addFirst("Arnav");
		 names.add("Sowmya");
		 names.add("Indhu");
		 names.addLast("Medisetty");
		 names.add(1, "Arjun");
		 
		 System.err.println("Names:" + names);
		 
		 String employeeName = names.get(1);
		 System.out.println("Employee name: "+employeeName);
		 System.out.println("To get the first element of arraylist:"+names.getFirst());
		 System.out.println("To get the last element of arraylist:"+names.getLast());
		 
		 names.set(0, "Sowmya Medisetty");
		 System.out.println("Updated index 0 value: "+names.get(0));
		 
		 System.out.println("Before removing the element:" + names.get(1));
		 
		 names.remove(1);
		 System.out.println("After removing the element:" + names.get(1));

		 System.out.println("Contains Sowmya :"+ names.contains("Sowmya"));
		 
		 System.out.println("No of elements:" + names.size());
		  System.out.println("Is list empty? : "+ names.isEmpty());
		  
		  //foreach loop
		  for(String listNames : names)
		  {
			  System.out.println(listNames);
		  }
		  
		  Iterator<String> iteratorlist = names.iterator();
		  System.out.println("Using Iterator List:");
		  while(iteratorlist.hasNext())
		  {
			  System.out.println(iteratorlist.next());
		  }
		  
		  Collections.sort(names);
		  System.out.println("Sorted by :"+names);
		  
		  Collections.reverse(names);
		  System.out.println("Reverser sorted by :"+names);
		  
		  names.sort((a, b) -> a.compareTo(b));  // Natural order
		  System.out.println(names);
		  names.sort((a,b) -> b.compareTo(a));
		  System.out.println(names);

	 }
}
