package com.example.stream;

import java.util.ArrayList;
import java.util.List;

import com.example.stream._Stream.Person.Gender;

public class _Stream {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Amjad", Gender.MALE));
		people.add(new Person("Ayan", Gender.MALE));
		people.add(new Person("Ather", Gender.MALE));
		people.add(new Person("Shumaila", Gender.FEMALE));
		people.add(new Person("Alishbah", Gender.FEMALE));

	}

	static class Person {
		private String name;
		private Gender gender;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

		enum Gender {
			MALE, FEMALE
		}

	}
}
