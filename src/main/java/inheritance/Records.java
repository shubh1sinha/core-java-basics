package inheritance;

public class Records {
	public static void main(String[] args) {
		Employee e = new Employee(100, "Shubh", 64996l);
		TraineeEmp te = new TraineeEmp(100, "Shubh", 64996l, "Good");
		Employee te1 = new TraineeEmp(100, "Shubh", 64996l, "Good");
		Person pe = new Person(1,"Shubh");
		
		System.out.println(pe);
		System.out.println(e.getDetails());
		System.out.println(te.getDetails());
		System.out.println(te1.getDetails());
		Employee.printVersion();
		Person p;
		
		//Superclass refernce of subclass object
		//Method implementation can be taken to object
		//Implicit type casting
		p=e;
		System.out.println(p.getDetails());
		
		p=te;
		System.out.println(te.getDetails());
		
	
		

	}

}
