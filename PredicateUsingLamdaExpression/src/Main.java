import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		child ch1 = new child(2);
		child ch2 = new child(4);
		child ch3 = new child(6);
		child ch4 = new child(8);
		child ch5 = new child(10);
		child ch6 = new child(12);
		child ch7 = new child(16);

		List<child> ch = Arrays.asList(new child[] {ch1,ch2,ch3,ch4,ch5,ch6,ch7});
		
		List<child> filter = childPredicate.FilterChilds(ch, childPredicate.filterByAge(5));
		
		for(child chi :filter) {
			System.out.println(chi.getAge());
			
		}
	}

}
