
public class employee extends person {
	float salary;

	employee(String name,float salary ) {
		super(name);
		this.salary= salary;	
	}
	
	void display() {
		System.out.println(salary + name);
	}

}
