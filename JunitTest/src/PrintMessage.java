
public class PrintMessage {
	
	private String message;
	
	public PrintMessage(String message){
		this.message=message;
	}
	
	public String getMessage() {
		System.out.println(message);
		return message;
	}

}
