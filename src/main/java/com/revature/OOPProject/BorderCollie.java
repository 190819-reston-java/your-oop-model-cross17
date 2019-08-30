package com.revature.OOPProject;


public class BorderCollie extends Dog implements Herding, Comparable<BorderCollie> {

	public BorderCollie(String name, String color, double age) {
		super(name, color, age);
		
	}
	
	private double age;

	public BorderCollie(String name, String color) {
		super(name, color);
		
	}

	public BorderCollie(String name) {
		super(name);
		
	}

	public BorderCollie() {
		
	}

	public void herd() {
		System.out.println(this.getName() + " is herding! He's a good boy.");

	}

	@Override
	public void play() {
		herd();
	}
	
	@Override
	public void sleep() {
		System.out.println(this.getName() + " is almost sleep!");
	}
	
		public void sleep(Bed b) {
			System.out.println(this.getName() + " is sleeping!");
		}
	
		public void sleep(Car c) {
			System.out.println(this.getName() + " can't sleep here");
		}
		
	public int compareTo(BorderCollie b) {
		
		return this.getName().compareTo(b.getName());
		//return this.getColor().compareTo(b.getColor());
	}
	
//	public void setAge(double age) {
//		if(age <= 0.0) {
//			throw new UnbornException();
//		}
//		this.age = age;
//	}
	
	

}
