import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int x,n,flag =1, loc=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no of Elemnet in toBe in Array");
		n=s.nextInt();
		
		int[] a = new int[n];
		System.out.println("Enter the Elemnets:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the Elemnet you want to delete");
		x= s.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				loc=i;
				break;
			}else {
				flag=0;
			}
		}
		if(flag==1) {
			for (int i =loc+1;i<n;i++) {
				a[i-1]=a[i];
			}
			System.out.println("After Deleting");
			
			for(int i=0;i<n-2;i++ ) {
				System.out.println(a[i]+",");
		}
		
			System.out.println(a[n-2]);
		}
		else {
		
				System.out.println("ElementNot Found");
		}
	}

}
