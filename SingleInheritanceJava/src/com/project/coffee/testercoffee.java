package com.project.coffee;

public class testercoffee {
	public static void main(String[] args) {
		Bru bru=new Bru();
		bru.Slno=01;
		bru.Name="Bru";
		bru.Size="100gm";
		bru.Brand="HUL";
		bru.Isitsmellsgood=true;
		

		
		Nescafe nescafe=new Nescafe();
		nescafe.Slno=02;
		nescafe.Name="Nescafe";
		nescafe.Size="150gm";
		nescafe.Brand="Nestle";
		nescafe.Isitsmellsgood=true;
		
		
		
		bru.coffee();
		bru.brucoffee();
		
		nescafe.coffee();
		nescafe.nescafecoffee();
		
				
	}

}
