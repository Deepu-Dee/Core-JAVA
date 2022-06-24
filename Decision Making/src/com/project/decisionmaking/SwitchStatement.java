package com.project.decisionmaking;

public class SwitchStatement {
public static void main(String[] args) {
	String Food="Pulav";
	
	switch(Food) {
	case "Idli":
	System.out.println("Breakfast");
	break;
	case "Rice Sambhar":
		System.out.println("Lunch");
		break;
	case "Curd Rice":
		System.out.println("Dinner");
		break;
		
		default:
			System.out.println("invalid, check again");
			
	}
}
}
