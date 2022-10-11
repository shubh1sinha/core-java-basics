package collections.list;

import java.util.*;

public class ListDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> al = new LinkedList<String>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter Name: ");
			String e = sc.next();
			al.add(e);
		}
		sc.close();

		System.out.println(al);

		System.out.println(al.get(4));

		al.add(2, "Raja");
		System.out.println(al);

		System.out.println("-----Iteration-----");
		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Welcome: " + name);
		}
		
		System.out.println("------Reverse------");
		while(itr.hasPrevious()) {
			String name = itr.previous();
			System.out.println("Welcome Back: " + name);
			
		}


	}

}
