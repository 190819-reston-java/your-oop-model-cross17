package com.revature.OOPProject;

public class Bulldog extends Dog {

	public Bulldog(String name, String color, double age) {
		super(name, color, age);
		// TODO Auto-generated constructor stub
	}

	public Bulldog(String name, String color) {
		super(name, color, 1);
		// TODO Auto-generated constructor stub
	}

	public Bulldog(String name) {
		super(name, "fawn");
		// TODO Auto-generated constructor stub
	}

	public Bulldog() {
		this("chase");
	}

	@Override
	public void play() {
		System.out.println(this.getName() + " is actually playing with other dogs! :D");

	}

	@Override
	public void sleep() {
		System.out.println(this.getName() + "is never ready to go to sleep");

	}
	
	public void sleep(Bed b) {
		System.out.println("You'd think that " + this.getName() + " would like sleeping on this.");
	}
	
	public void sleep(Car c) {
		System.out.println("It's so weird that " + this.getName() + " falls asleep faster in the car than in the house");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
