package com.revature.OOPProject;


public class BorderCollie extends Dog implements Herding {

	public BorderCollie(String name, String color, double age) {
		super(name, color, age);
		
	}

	public BorderCollie(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	public BorderCollie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public BorderCollie() {
		// TODO Auto-generated constructor stub
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
	
	

}
