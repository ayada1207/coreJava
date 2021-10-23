import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testJunitClass {
	

	String message ="helloworld";
	
	PrintMessage junit = new PrintMessage(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, junit.getMessage());
	}
	

}
