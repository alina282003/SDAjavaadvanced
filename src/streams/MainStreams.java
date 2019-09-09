package streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import lambdaexpressions.Person;

public class MainStreams {

	public static void main(String[] args) {

		 SourceOfPersons.getPersonList().stream()
				.filter(person -> person.getGender() == Person.Sex.MALE)
				.sorted( (firstPerson, secondPerson) -> {
					return secondPerson.getName().compareTo(firstPerson.getName());
				})
				.forEach(Person::printPerson);
//				.collect(Collectors.toList());
		
		 Set<String> emails =  SourceOfPersons.getPersonList().stream()
			.filter(person -> person.getGender() == Person.Sex.MALE)
			.sorted( (firstPerson, secondPerson) -> {
				return secondPerson.getName().compareTo(firstPerson.getName());
			})
			.map(Person::getEmailAddress)
			.collect(Collectors.toSet());
		 
		 System.out.println(emails);
		 
		
		 
		 String totalAge = SourceOfPersons.getPersonList().stream()
			.filter(person -> person.getAge() < 30)
			.sorted( (firstPerson, secondPerson) -> {
				return secondPerson.getName().compareTo(firstPerson.getName());
			})
			.map(Person::getEmailAddress)
			.findFirst().get();
//			.reduce("", (sum, age) -> sum = sum + " ," + age );
			
		 System.out.println(totalAge);
		 
		 	
	}

}
