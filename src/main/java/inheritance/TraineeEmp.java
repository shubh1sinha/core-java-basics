package inheritance;

public class TraineeEmp extends Employee {
	protected String performance;

public TraineeEmp(int id, String name, double salary, String performance) {
	super(id, name, salary);
	this.performance=performance;
	
}

	@Override
	public String getDetails() {
		//return id + " " + name + " " + salary+ " "+performance ;
		return super.getDetails()+" "+performance;
	}
	public void fun() {
		System.out.println("Having Fun");
	}
}
