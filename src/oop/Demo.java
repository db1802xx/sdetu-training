package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name +  " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "78787819";
		
		// Abstraction
		person1.walk();
		
		///
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@testmail.com";
		person2.phone = "35048765";
		
		person2.walk();
		person2.sleep();
		person2.eat();
		
		/*
		// Person-
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testmail.com";
		String phone = "78787819";
		
		// Action, activity, behavior
		walking(name);
		System.out.println(name + " is eating");

		// Attributes, variables, adjectives, descriptors
		String name2 = "Sarah";
		String email2 = "sarah@testmail.com";
		String phone2 = "35048765";
		
		// Action, activity, behavior
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		*/
	}
	
	/*
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
	}
	*/
}
