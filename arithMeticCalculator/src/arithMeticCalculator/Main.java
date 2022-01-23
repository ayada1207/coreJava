package arithMeticCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		operation op = new operation();
		
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter Two Number");
      int a = scan.nextInt();
      int b = scan.nextInt();
      
      System.out.println("Press 1 for Addition");
      System.out.println("Press 2 for Substraction");
      System.out.println("Press 3 for multiplication");
      System.out.println("Press 4 for Division");
      
      int c = scan.nextInt();
      
      if(c==1) {
      
      System.out.println("Addition of Entered number is : "+ op.operationAddition(a, b));
	}else if(c==2) {
		 System.out.println("Substraction of Entered number is : "+ op.operationSubstraction(a, b));
	}else if(c==3) {
		 System.out.println("multiplication of Entered number is : "+ op.operationMultiplication(a, b));
	}else if(c==4) {
		 System.out.println("Division of Entered number is : "+ op.operationDivision(a, b));
	}
	}
}
