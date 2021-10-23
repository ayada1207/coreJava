import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Jhon");
		list.add("Ram");
		list.add("Krishna");
		list.add("Adam");
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
