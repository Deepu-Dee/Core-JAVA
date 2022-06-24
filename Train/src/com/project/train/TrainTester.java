package com.project.train;

public class TrainTester {
	public static void main(String[] args) {
		Train train=new Train();
		
		train.Slno=0;
		train.Name="Chennai Express";
		train.From="Banglore";
		train.To="Chennai";
		train.Timeing="7.30am";
		train.price=200;
		
		
		
	/*	if(train.Slno>1) {
			System.out.println("train slno is valid= "+train.Slno);
		}
		else {
			System.out.println("train slno is invalid...");
			
//			else if(train.Name!=null & !train.Name.isBlank()) {
//				System.out.println("train slno is valid="+train.Name);
//			}
	
			else {
				System.out.println(",,,");
			}
		if(train.Slno>=1) {
			System.out.println("train slno valid= "+train.Slno);
		}
		else {
			System.out.println("invalid");
	}
		
		if(train.Name!=null & !train.Name.isBlank()) {
			System.out.println("train name is valid= "+train.Name);
		}
		else {
			System.out.println("train name is invalid");
		}*/
		
		train.providestraportationfacility();
		train.Addition();
		train.substraction();
		train.division();
		train.multiplication();
		
		System.out.println("Train Slno ="+train.Slno);
		System.out.println("Train Name ="+train.Name);
		System.out.println("Train From ="+train.From);
		System.out.println("Train To ="+train.To);
		System.out.println("Train Timeing ="+train.Timeing);
		
		System.out.println("=============================");
		
		
		Train train2=new Train();
		
		train2.Slno=02;
		train2.Name="Shatabdhi express";
		train2.From="Banglore";
		train2.To="Manglore";
		train2.Timeing="8pm";
		train2.providestraportationfacility();
		train2.Addition();
		train2.substraction();
		train2.division();
		train2.multiplication();
		
		
		System.out.println("Train2 Slno ="+train2.Slno);
		System.out.println("Train2 Name ="+train2.Name);
		System.out.println("Train2 From ="+train2.From);
		System.out.println("Train2 To ="+train2.To);
		System.out.println("Train2 Timeing ="+train2.Timeing);
		
		
		
	}
}
