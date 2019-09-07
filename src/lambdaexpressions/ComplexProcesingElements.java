package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ComplexProcesingElements <X, Y> {
	
	
	public static <X, Y> void processElements(
		    Iterable<X> source,
		    Predicate<X> tester,
		    Function <X, Y> mapper,
		    Consumer<Y> block) {
		    for (X p : source) {
		        if (tester.test(p)) {
		            Y data = mapper.apply(p);
		            block.accept(data);
		        }
		    }
		}
	
	
	
	
	
	
//	roster
//    .stream()
//    .filter(
//        p -> p.getGender() == Person.Sex.MALE
//            && p.getAge() >= 18
//            && p.getAge() <= 25)
//    .map(p -> p.getEmailAddress())
//    .forEach(email -> System.out.println(email));

}
