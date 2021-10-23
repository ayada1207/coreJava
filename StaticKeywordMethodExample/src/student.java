
public class student {
	
	 private int rollno;
	 private String name;
	 static String college = "MIT"; 
	 
	 static void change() {
		 college ="IIT";
	 }

	
      public student(int r, String n) {
    	  rollno=r;
    	  name =n;
		
	}

	void display() {
    	  System.out.println(rollno + name + college);
      }
}
