package collections.list;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shubh");
		al.add("Sinha");
		al.add("Molu");
		al.add("Golu");
		al.add("Nikku");
		al.add("Piku");
		al.add("Chiku");
		al.add("Tili");
		al.add("Tilu");

		System.out.println(al);

		System.out.println(al.get(4));

		al.add(2, "Raja");
		System.out.println(al);

		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Welcome: " + name);
		}
		while(itr.hasPrevious()) {
			String name = itr.previous();
			System.out.println("Welcome Back: " + name);
			
		}


	}

}
