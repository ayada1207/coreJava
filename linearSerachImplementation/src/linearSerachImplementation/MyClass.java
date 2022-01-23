package linearSerachImplementation;

public class MyClass {

	int data[] = new int[] {21,23,34,23,12,28,54,43,76,77,83,3,21,9,53};
	int se = 433,pos =-1;
	
	public int findElement()
	{
		for (int i=0;i<data.length;i++) {
			if(data[i]==se) {
				pos =i;
				System.out.println("Element found at "+ (pos+1));
			}
		}
			if(pos==-1) {
				System.out.println("Element Not found");
			}
				
		
		return (pos+1);
		
	}
	
	public static void main(String[] args) {
	MyClass ms  = new MyClass();
	ms.findElement();

	}

}
