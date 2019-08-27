package com.revature.OOPProject;

import java.util.ArrayList;
import java.util.List;

public class DogDriver extends Dog {

	public static void main(String[] args) {
		
		list();
		
	}
		
		private static void list() {
			List <BorderCollie> borderCollieList = new ArrayList<BorderCollie>();
				borderCollieList.add(new BorderCollie());
				borderCollieList.add(new BorderCollie("Lady", "brindle", 3));
				borderCollieList.add(new BorderCollie("Angel", "brown,", .5));
				borderCollieList.add(new BorderCollie("Jerome", "gray"));
				borderCollieList.add(new BorderCollie("Casper"));
				
				System.out.println(borderCollieList);
				
		
		}

		@Override
		public void beg() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void play() {
			// TODO Auto-generated method stub
			
		}	
		
		

}
