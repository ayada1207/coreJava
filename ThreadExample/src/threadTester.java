
public class threadTester {

	public static void main(String[] args) {
		helloRunner hello = new helloRunner();
		Thread t = new Thread(hello);
		t.start();
	}

}
