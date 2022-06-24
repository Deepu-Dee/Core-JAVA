package com.project.bus;

public class bustester {

	public static void main(String[] args) {
		
		BUS bus=new BUS();
		
		bus.SLNO=01;
		bus.NAME="BMTC";
//		bus.COLOR="WHITE";
		bus.BUSNUMBER="KA 01 8894";
		bus.CONTACTNUMBER=9606643321L;
		bus.helpstocarrypeople();
		
		System.out.println("BUS SLNO = "+bus.SLNO);
		System.out.println("BUS NAME = "+bus.NAME);
		System.out.println("BUS COLOR = "+BUS.COLOR);
		System.out.println("BUS NUMBER = "+bus.BUSNUMBER);
		System.out.println("CONTACT NUMBER = "+bus.CONTACTNUMBER);
		
	System.out.println("-------------------------------------------------------------");			
			BUS bus2= new BUS();
			bus2.SLNO=02;
			bus2.NAME="BMTC";
//			bus2.COLOR="BLUE";
			bus2.BUSNUMBER="KA-o6-F-2022";
			bus2.CONTACTNUMBER=45698712364L;
			bus.helpstocarrypeople();
			
			System.out.println("BUS SLNO = "+bus2.SLNO);
			System.out.println("BUS NAME = "+bus2.NAME);
			System.out.println("BUS COLOR = "+BUS.COLOR);
			System.out.println("BUS NUMBER = "+bus2.BUSNUMBER);
			System.out.println("CONTACT NUMBER = "+bus2.CONTACTNUMBER);
				
			
			
			
			
			
			
			
	}
}
