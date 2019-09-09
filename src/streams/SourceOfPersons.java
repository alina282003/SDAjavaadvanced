package streams;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import lambdaexpressions.Person;

public class SourceOfPersons {

	public static List<Person> getPersonList() {
		Person gabor = new Person("Gabor", LocalDate.of(1984, Month.DECEMBER, 20), Person.Sex.MALE, "gabor@sda.com");
		Person cipri = new Person("Cipri", LocalDate.of(1990, Month.JANUARY, 31), Person.Sex.MALE, "cipri@sda.com");
		Person paul = new Person("Paul", LocalDate.of(1994, Month.AUGUST, 31), Person.Sex.MALE, "paul@sda.com");
		Person cristi = new Person("Cristi", LocalDate.of(1993, Month.FEBRUARY, 2), Person.Sex.MALE, "cristi@sda.com");
		Person cipriR = new Person("Cipri", LocalDate.of(1983, Month.FEBRUARY, 24), Person.Sex.MALE, "cipriR@sda.com");
		Person flaviu = new Person("Flaviu", LocalDate.of(1989, Month.APRIL, 5), Person.Sex.MALE, "flaviu@sda.com");
		Person sebastian = new Person("Sebastian", LocalDate.of(1989, Month.AUGUST, 3), Person.Sex.MALE,
				"sebastian@sda.com");
		Person sebi = new Person("Sebastian", LocalDate.of(1983, Month.SEPTEMBER, 10), Person.Sex.MALE, "sebi@sda.com");
		Person gabi = new Person("Gabi", LocalDate.of(1976, Month.APRIL, 5), Person.Sex.MALE, "gabi@sda.com");
		Person madalin = new Person("Madalin", LocalDate.of(1996, Month.FEBRUARY, 23), Person.Sex.MALE,
				"madalin@sda.com");
		Person alex = new Person("Alex", LocalDate.of(1982, Month.FEBRUARY, 21), Person.Sex.MALE, "alex@sda.com");
		Person minor = new Person("Minor", LocalDate.of(2015, Month.FEBRUARY, 21), Person.Sex.MALE, "minor@sda.com");
		Person alina = new Person("Alina", LocalDate.of(1982, Month.DECEMBER, 28), Person.Sex.FEMALE, "alina@sda.com");
		Person anca = new Person("Anca", LocalDate.of(1983, Month.MARCH, 12), Person.Sex.FEMALE, "anca@sda.com");
		
		return Arrays.asList(gabor, cipri, paul, cristi, cipriR, flaviu,
				sebastian, sebi, gabi, madalin, alex, minor, alina, anca);
	}

}
