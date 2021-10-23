import java.util.function.IntBinaryOperator;

public class methodReference {

	public static void main(String[] args) {
		
		methodReference method = new methodReference();
		method.operation(methodReference :: multiply,22,10);
		method.operation(methodReference :: add,22,10);

	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public void operation(IntBinaryOperator operator, int a ,int b ) {
		System.out.println(operator.applyAsInt(a, b));
	}

}
