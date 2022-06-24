package com.project.bank;

public class Hdfc {
	int Slno;
	static String Branchname="HDFC Tumkur";
	public String Managername;
	String Location;
	public int PinCode;
	long Contactnumber;
	boolean Provideshouseloan;
	int Age;
	int Experienceinyeares;
	/*static int Female=20;
	static int Male=30;
	static int Total=Male+Female;
	static int substraction=Total-Male;
	static int sub=Total-Female;*/
	
	/*public Hdfc() {
			
	}*/
	
	public Hdfc(String managername, int pincode) {
		super();
		Managername = managername;
		PinCode = pincode;
		
	}
	
	public void totalemployees() {
		int Female=20;
		int Male=30;
		int Total=Female+Male;
		
		System.out.println("Total Employees= "+Total);
				
	}
	public void femaleemployees() {
		int Total=50;
		int Male=30;
		int Female=Total-Male;
		
		System.out.println("Total Female Employees= "+Female);
	}
	
	public void maleemployees() {
		int Total=50;
		int Female=20;
		int Male=Total-Female;
		
		System.out.println("Total Female Employees= "+Male);
		
	}
	
	public void Bankingsector() {
		System.out.println("provides loans......");

	}
	

}
 