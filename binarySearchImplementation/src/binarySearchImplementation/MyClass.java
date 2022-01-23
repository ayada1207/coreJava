package binarySearchImplementation;

public class MyClass {
	
	int data[] = new int[] {12,14,21,23,34};
	int low =0,high = (data.length)-1;
	int mid = (high + low)/2;
	int loc=-1;
	int se = 34;
	
	public int findData()
	{
		while(low<=high)
		{
			if(data[mid] == se) {
				loc=mid;
				return loc;
			}else if(data[mid] < se)
			{
				low = mid+1;
			}else {
				high = mid-1;
			
			}
			mid = (low+high)/2;
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		MyClass ms = new MyClass();
		int result = ms.findData();
		
		if(result ==-1) {
			System.out.println("Element Not Found");
		}else {
		 System.out.println("Element FOund at: "+(result+1));
		}
	}

}
