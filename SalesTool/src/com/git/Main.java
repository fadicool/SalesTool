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
	}

}
