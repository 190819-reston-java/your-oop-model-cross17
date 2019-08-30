package com.revature.OOPProject;

public abstract class Dog {
//	Your OOP Model, EXTENDED for the week:
//		You're free to work in pairs -- just message me in the Slack
//		1. Come up with some domain model and implement it
//		*2. Use at least one Abstract Class, at least one Interface, at least two concrete classes
//		*3. Override at least one method
//		*4. Overload at least one method
//		*5. Use at least one static field and or method
//		*6. Make sure your methods are implemented, even if they all just sysout something
//		*7. Make at least one of your Objects implement Comparable
//		*8. Demonstrate sorting your Objects using a TreeSet or Arrays.sort
//		9. Write, throw, and handle at least one checked Exception and at least one unchecked Exception
//		10. Plan to present your model in about 5 minutes, informally, on Friday.  You'll be able to use the board and/or present your screen.  No slideshows please.
//		Bonus:
//		-Create custom collections for your domain model by extending and
//		 implementing Abstract classes and Interfaces from the Collections API
//		-Create a separate Comparator object to compare your Objects in more than one way
//		-Write a Driver class that does something fun: writes/reads from file, interacts with a user on the command line, draws ASCII art, etc...
	

	private String name;
	private String color;
	private double age;
	
	
	public Dog(String name, String color, double age) {
		super();
		this.name = name;
		this.color = color;
		this.setAge(age);
		
	}
	
	public Dog(String name, String color) {
		this(name, color, 2);
	}
	
	public Dog(String name) {
		this(name, "brown");
	}
	
	public Dog() {
		this("Rex");
	}
	
	public void bark() {
		System.out.println(this.name + " is barking!");
	}
	
	public void wagTail() {
		System.out.println(this.name + " is wagging their tail!");
	}
	
	
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
		if(age < 0.0) {
			throw new UnbornException();
		}
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
}
