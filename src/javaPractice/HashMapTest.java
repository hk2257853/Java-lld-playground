package javaPractice;

import java.util.HashMap;
import java.util.Objects;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	map.get(key)
//	hashCode() → finds the right bucket
//	equals() → finds the right entry within that bucket

	// 1. We override equals so that two different objects with same data are
	// "equal"
	@Override
	public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return this.name.equals(person.name) && this.age == person.age;
//        return age == person.age && Objects.equals(name, person.name);
	}

	// 2. UNCOMMENT THIS TO FIX THE BUG
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Person, String> map = new HashMap<>();

		Person p1 = new Person("Alice", 30);
		Person p2 = new Person("Alice", 30);

		map.put(p1, "Engineer");

		// 1. Logic Check: Are they the same person?
		System.out.println("Equals: " + p1.equals(p2)); // Expect: true

		// 2. Hash Check: Do they point to the same bucket?
		System.out.println("Hash p1: " + p1.hashCode());
		System.out.println("Hash p2: " + p2.hashCode()); // Expect: Same as p1

		// 3. The "Gold Standard" Map Test
		System.out.println("Map Lookup: " + map.get(p2)); // Expect: "Engineer" (If I don't override I get null!)
	}
}