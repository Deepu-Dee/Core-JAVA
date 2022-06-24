package com.project.constructor;

public class testerscool {
	public static void main(String[] args) {
		Scool scool=new Scool(1,"Tumkuruniversity","BHroad","Kumar",1234567890L);
		
		scool.scool();
		
		
	scool.Slno=1;
	scool.Name="Tumkuruniversity";
	scool.Area="BHRoad";
		scool.Principalname="Kumar";
		scool.Contactnumber=1234567890L;
		
			System.out.println(scool.Slno);	
			System.out.println(scool.Name);
			System.out.println(scool.Area);
			System.out.println(scool.Principalname);
			System.out.println(scool.Contactnumber);
			
			System.out.println();
			
			Scool scool2=new Scool(2,"Chritiancollege","NH4Road","Ravi",1234567890L);
			
			scool2.scool();
		
			
			scool2.Slno=2;
			scool2.Name="ChritianCollege";
			scool2.Area="NH4Road";
			scool2.Principalname="Ravi";
			scool2.Contactnumber=1234567890L;
			
				System.out.println(scool2.Slno);	
				System.out.println(scool2.Name);
				System.out.println(scool2.Area);
				System.out.println(scool2.Principalname);
				System.out.println(scool2.Contactnumber);
				
			System.out.println();	
				
				
				Scool scool3=new Scool(3,"Sridevi","NH4Road","Raghavendra",9980369438L);
				
				scool3.scool();
				
			scool3.Slno=3;
				scool3.Name="Sridevi";
				scool3.Area="NH4Road";
				scool3.Principalname="Raghavendra";
				scool3.Contactnumber=9980369438L;
				
					System.out.println(scool3.Slno);	
					System.out.println(scool3.Name);
					System.out.println(scool3.Area);
					System.out.println(scool3.Principalname);
					System.out.println(scool3.Contactnumber);
					
				
		
	}



}
