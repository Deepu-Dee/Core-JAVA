package com.project.constructor;

public class Scool {
	public int Slno;
	public String Name;
	public String Area;
	public String Principalname;
	public long Contactnumber;
	
	
	public Scool() {
		
	
	}


	public Scool(int slno, String name, String area, String principalname, long contactnumber) {
		super();
		Slno = slno;
		Name = name;
		Area = area;
		Principalname = principalname;
		Contactnumber = contactnumber;
	}
	
	public void scool() {
		System.out.println(Slno+" "+Name+" "+Area+" "+Principalname+" "+Contactnumber);
	}
}
