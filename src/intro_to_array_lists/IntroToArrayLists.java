package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> arrlist = new ArrayList<String>();
		//2. Add five Strings to your list
		arrlist.add("one");
		arrlist.add("two");
		arrlist.add("three");
		arrlist.add("four");
		arrlist.add("five");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String string : arrlist) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.get(2));
		System.out.println(arrlist.get(4));
		//6. Print all the Strings in reverse order.
		
		System.out.println(arrlist.get(4));
		System.out.println(arrlist.get(3));
		System.out.println(arrlist.get(2));
		System.out.println(arrlist.get(1));
		System.out.println(arrlist.get(0));
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
