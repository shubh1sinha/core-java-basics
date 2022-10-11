package inheritance;

public class Person {
	protected int id;
	protected String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getDetails() {
		return id + " " + name;
	}

	public static void printVersion() {
		System.out.println("Version is 1.8");
	}
	
	@Override
	public String toString() {
		return "ToString is initialized";
	}
	
}
