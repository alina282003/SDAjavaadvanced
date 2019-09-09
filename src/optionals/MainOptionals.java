package optionals;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

import lambdaexpressions.Person;

public class MainOptionals {

	public static void main(String[] args) {

		String stringVariable = "Java";

		Optional<String> testOptional = Optional.ofNullable(stringVariable);

		System.out.println(testOptional.isPresent());

		testOptional.ifPresent(s -> {
			s = "Programing";
			System.out.println(s);
		});
		System.out.println(testOptional.orElse("The variable doesn't exist"));
		
		
		Person person = new Person("Gabor", LocalDate.of(1984, Month.DECEMBER, 20), Person.Sex.MALE, "gabor@sda.com");
		
		Optional<Person> personOptional = Optional.ofNullable(person);
		
		if(personOptional.isPresent()) {
		 System.out.println(personOptional.get().getAge());
		}
		
		person = null;
		
		Optional<Person> secondOptional = Optional.ofNullable(person);
		
		doSomethig(secondOptional);
	
		
	}
	
	
	public static void doSomethig(Optional<Person> optional) {
		Person person = optional.orElseGet(() -> new Person("Alina", LocalDate.of(1984, Month.DECEMBER, 20), Person.Sex.MALE, "gabor@sda.com"));
		System.out.println(person.getName());
		
		//		if(optional.isPresent()) {
//			 System.out.println(optional.get().getAge());
//			}
	}

}
