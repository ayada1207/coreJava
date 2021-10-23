import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class childPredicate {

	static Predicate<child> filterByAge(int x){
		return a->a.getAge()>x;
	}
	
	static List<child> FilterChilds(List<child> ch, Predicate<child> predicate){
		return ch.stream().filter(predicate).collect(Collectors.<child> toList());
	}
}
