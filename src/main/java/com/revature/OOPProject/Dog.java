package com.revature.OOPProject;


public abstract class Dog {
	/*Your OOP Model:
		1. Come up with some domain model and implement it
		2. Use at least one Abstract Class, at least one Interface, at least two concrete classes
		3. Override at least one method
		4. Overload at least one method
		5. Use at least one static field and or method
		Bonus:
		Create custom collections for your domain model by extending and
		implementing Abstract classes and Interfaces from the Collections API
		Some Suggestions: animals, vehicles, pokemon, shapes, fruity drinks, ...*/
	

	private String name;
	private String color;
	private double age;
	
	
	public Dog(String name, String color, double age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		
	}
	
	public Dog(String name, String color) {
		this(name, color, 2);
		System.out.println(color);
	}
	
	public Dog(String name) {
		this(name, "brown");
	}
	
	public Dog() {
		System.out.println("Rex");
	}
	
	public void bark() {
		System.out.println(this.name + " is barking!");
	}
	
	public void wagTail() {
		System.out.println(this.name + " is wagging their tail!");
	}
	
	public abstract void beg();
	
	public abstract void sleep();
	
	public abstract void play();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
	}
	
}
