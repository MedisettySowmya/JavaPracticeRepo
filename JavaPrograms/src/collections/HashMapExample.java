package collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> countries = new HashMap<>();
		countries.put(1, "India");
		countries.put(2, "USA");

		for (Integer id : countries.keySet()) {
			System.out.println("key: " + id + " value: " + countries.get(id));
		}
		for (String value : countries.values()) {
			System.out.println(value);
		}
		System.out.println("Entry set:" + countries.entrySet());
		System.out.println(countries);
		System.out.println(countries.size());

		// get an item
		System.out.println(countries.get(1));// refer to its key
		System.out.println(countries.get("India"));// not refer to its value

		// remove
		System.out.println(countries.remove(2));
		System.out.println(countries.remove(1, "India"));

		countries.put(3, "Germany");
		// clearing
		countries.clear();
		System.out.println(countries);

		// size
		System.out.println(countries.size());
		
		//is empty
		System.out.println("Hashmap is empty : " + countries.isEmpty());

	}

}
