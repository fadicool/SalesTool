package com.git;

public class Main {
	public static void main(String[] args){
		SalesData data = new SalesData();
		
		data.display();		
		displayGreeting();
	}
	
	private static void displayGreeting(){
		System.out.println("Hello happy Sales People");
		System.out.println("This App shows Sales Data");
		
		System.out.println("Test-1");
		
		System.out.println("Testing if changes made after creating a new Branch can be seen in the new Branch.");
		
	}

}
