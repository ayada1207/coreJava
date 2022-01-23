package myPackage;

public class MyClass {

	public static void main(String[] args) {
		String  a="Arpit";
		String  b="Yadav";
		int c= 5;
		int d = 4;

		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		c= c+d;
		d = c-d;
		c = c-d;
		
		System.out.println(a+":"+b);
		System.out.println(c+":"+d);

	}

}
