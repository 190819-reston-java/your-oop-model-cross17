package com.revature.OOPProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.log4j.Logger;




public class DogDriver extends Dog {
	
	//private String name;
	
	public static int errorCounter = 0;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static Logger logger = Logger.getLogger(DogDriver.class);



	public static void main(String[] args) {
		
		list();
		home();
		
	}
		
		private static void list() {
			List <BorderCollie> borderCollieList = new ArrayList<BorderCollie>();
				borderCollieList.add(new BorderCollie());
				borderCollieList.add(new BorderCollie("Lady", "brindle", 3.5));
				borderCollieList.add(new BorderCollie("Angel", "brown", .5));
				borderCollieList.add(new BorderCollie("Jerome", "gray"));
				borderCollieList.add(new BorderCollie("Casper", "white", 4));
//				borderCollieList.add(new BorderCollie("myDog", "yes", 0));
				
				//System.out.println(borderCollieList);
				
				//Set<BorderCollie> borderCollieSet = new HashSet<BorderCollie>(borderCollieList);
				
				SortedSet<BorderCollie> borderCollieTreeSet = new TreeSet<BorderCollie>(borderCollieList);
					

				System.out.println(borderCollieTreeSet);
				
				
		
		}
		
		
		

		

		@Override
		public void sleep() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void play() {
			// TODO Auto-generated method stub
			
		}	
		

		
		private static void home() {
			System.out.println("");
			System.out.println("Using the List above, please enter the name of the dog you want to adopt below:");

			String adoptedDogName = sc.nextLine();
			
			
			
			Path p;
			try {
				p = Files.createFile(Paths.get(adoptedDogName));
			}catch (IOException e) {
				errorCounter++;
				System.out.println("This dog is no longer available. Please select another dog.");
				//logger.error("I'm sorry, this dog is no longer available :(. Please Select a different dog from the list.");
				
				
				if(errorCounter > 5) {
					logger.fatal("Too many unsuccessful attempts. Exiting Program");
					System.exit(1);
				}
				//logger.info("Error encountered. Restarting program.");
				
				home();
				
				
				return;
				
			}
			
			System.out.println("Adoption started for: " + p + "!");
			System.out.println("Please go speak with receptionist to continue process!");
			
//			while(sc.hasNext()) {
//				String nextLine = sc.nextLine();
//				if(nextLine.equals("STOP!")) {
//					break;
//				}
//				
//				//Collections is a utility class
//				//singleton is a set with only one element
//				//the options provided say what we interact with the file
//				//StandardOpenOption is an example of an enum:
//				//an enum just being a fixed set of options
//				try {
//					Files.write(p, Collections.singleton(nextLine), StandardOpenOption.APPEND);
//				} catch (IOException e) {
//					logger.fatal("writing to file failed, exiting." + e);
//				}
//				logger.trace("Wrote line to file: " + nextLine);
//			}
			System.out.println("Thank you for saving a life!!");
			System.out.println("Exiting program");
		}
		
			
}
