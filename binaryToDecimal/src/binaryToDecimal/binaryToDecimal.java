package binaryToDecimal;



public class binaryToDecimal {

	public static void main(String[] args) {
		
		binaryToDecimal decimal = new binaryToDecimal();
		System.out.println(decimal.convetToDecimal("10101"));
	}
	
	public int convetToDecimal(String binary) {
		int result =0;
		try {
			for(int i=1;i<=binary.length();i++) {
				if(binary.charAt((binary.length()-i))=='1') {
					result += Math.pow(2,i-1);
				}
			}
		} catch (Exception e) {
			System.out.println("exception Occured");
			e.printStackTrace();
		}
		return result;
		
	}

}
