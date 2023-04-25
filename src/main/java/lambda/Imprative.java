package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Imprative {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Amjad", Gender.MALE));
		people.add(new Person("Ayan", Gender.MALE));
		people.add(new Person("Ather", Gender.MALE));
		people.add(new Person("Shumaila", Gender.FEMALE));
		people.add(new Person("Alishbah", Gender.FEMALE));
		
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
