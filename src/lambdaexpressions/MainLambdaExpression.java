package lambdaexpressions;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainLambdaExpression {

	public static void main(String[] args) {

		Person gabor = new Person("Gabor", LocalDate.of(1984, Month.DECEMBER, 20), Person.Sex.MALE, "gabor@sda.com");
		Person cipri = new Person("Cipri", LocalDate.of(1990, Month.JANUARY, 31), Person.Sex.MALE, "cipri@sda.com");
		Person paul = new Person("Paul", LocalDate.of(1994, Month.AUGUST, 31), Person.Sex.MALE, "paul@sda.com");
		Person cristi = new Person("Cristi", LocalDate.of(1993, Month.FEBRUARY, 2), Person.Sex.MALE, "cristi@sda.com");
		Person cipriR = new Person("Cipri", LocalDate.of(1983, Month.FEBRUARY, 24), Person.Sex.MALE, "cipriR@sda.com");
		Person flaviu = new Person("Flaviu", LocalDate.of(1989, Month.APRIL, 5), Person.Sex.MALE, "flaviu@sda.com");
		Person sebastian = new Person("Sebastian", LocalDate.of(1989, Month.AUGUST, 3), Person.Sex.MALE, "sebastian@sda.com");
		Person sebi = new Person("Sebastian", LocalDate.of(1983, Month.SEPTEMBER, 10), Person.Sex.MALE, "sebi@sda.com");
		Person gabi = new Person("Gabi", LocalDate.of(1976, Month.APRIL, 5), Person.Sex.MALE, "gabi@sda.com");
		Person madalin = new Person("Madalin", LocalDate.of(1996, Month.FEBRUARY, 23), Person.Sex.MALE, "madalin@sda.com");
		Person alex = new Person("Alex", LocalDate.of(1982, Month.FEBRUARY, 21), Person.Sex.MALE, "alex@sda.com");
		Person minor = new Person("Minor", LocalDate.of(2015, Month.FEBRUARY, 21), Person.Sex.MALE, "minor@sda.com");

		List<Person> persons = Arrays.asList(new Person[] { gabor, cipri, paul, cristi, cipriR, flaviu, sebastian, sebi,
				gabi, madalin, alex, minor });

		System.out.println(persons.size());
		System.out.println(getAdults(persons).size());

		System.out.println(getAdultsWithAnonymousClass(persons).size());

		CheckPerson checkInRange = person -> person.getAge() >= 18 && person.getAge() < 30;
		System.out.println(getPersonsWithCondition(persons, person -> person.getAge() >= 18).size());
		System.out.println(getPersonsWithCondition(persons, checkInRange).size());

		Predicate<Person> predicate = person -> person.getAge() >= 18 && person.getAge() < 30;

		Function<Person, String> mapper = person -> {
			person.setEmailAddress("personInRange@sda.com");
			return person.getEmailAddress();
		};
		Consumer<String> consumer = email -> System.out.println(email);

		//ComplexProcesingElements.<Person, String>processElements(persons, predicate, mapper, consumer);
		ComplexProcesingElements.<Person, String>processElements(persons,
				(Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 30,
				Person::getEmailAddress, email -> System.out.println(email));

	}

	public static List<Person> getAdults(List<Person> persons) {
		List<Person> adults = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getAge() >= 18) {
				adults.add(person);
			}
		}

		return adults;
	}

	public static List<Person> getAdultsWithAnonymousClass(List<Person> persons) {
		CheckPerson checkPerson = new CheckPerson() {

			@Override
			public boolean check(Person person) {
				return person.getAge() >= 18;
			}

		};
		List<Person> adults = new ArrayList<Person>();
		for (Person person : persons) {
			if (checkPerson.check(person)) {
				adults.add(person);
			}
		}
		return adults;
	}

	public static List<Person> getPersonsWithCondition(List<Person> persons, CheckPerson checkPerson) {
		List<Person> adults = new ArrayList<Person>();
		for (Person person : persons) {
			if (checkPerson.check(person)) {
				adults.add(person);
			}
		}
		return adults;
	}

}
