package com.oops.concept;

public class Demo {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.barking();
		d.eating();
		System.out.println("changes done now");

	}

}

class Dog{
	
	String breed = "dobermandog";
	String name = "puppy";
	String color = "white";
	
	public void barking() {
		System.out.println(breed+" is barking");
	}
	
	public void eating() {
		System.out.println(breed+" is eating");
	}
	
	public void sleeping() {
		System.out.println(breed+" is sleeping");
	}
	
	public void walking() {
		System.out.println(breed+" is walking");
	}
	
	public void running() {
		System.out.println(breed+" is running");
		System.out.println("-----------------------------------------");
	}
	
}
