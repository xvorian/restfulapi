package lambda;

import java.util.ArrayList;
import static lambda.Person.Gender.FEMALE;
import static lambda.Person.Gender.MALE;
import java.util.List;

public class Imprative {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Amjad", MALE));
		people.add(new Person("Ayan", MALE));
		people.add(new Person("Ather", MALE));
		people.add(new Person("Shumaila", FEMALE));
		people.add(new Person("Alishbah", FEMALE));
		
		// Imperative Approach
		System.out.println("Imperative Approach");
		List<Person> females = new ArrayList<>();
		
		for(Person person: people) {
			if(Gender.FEMALE.equals(person.getGender())){
				females.add(person);
			}
		}
		for(Person female: females) {
			System.out.print(female.toString());
		}
		
		//Declarative Approach
		System.out.println("Declarative Approach");
		
		/* 
		
		Predicate Approach
		* Predicate<? super Person> predicate = person -> Gender.FEMALE.equals(person.getGender());
		* people.stream().filter(predicate).forEach(System.out::println);
		
		*/
		
		people.stream().filter(person -> Gender.FEMALE.equals(person.getGender())).forEach(System.out::println);

	}
}
