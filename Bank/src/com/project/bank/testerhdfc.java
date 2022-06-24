package com.project.bank;

public class testerhdfc {
	public static void main(String[] args) {
		Hdfc hdfc=new Hdfc("Kumar" , 572106);
		
		hdfc.Slno=01;
		/*hdfc.Branchname="HDFCTumkur";*/
		hdfc.Managername="Kumar";
		hdfc.Location="Tumkur";
		hdfc.PinCode=572106;
		hdfc.Contactnumber=4569871230L;
		hdfc.Provideshouseloan=true;
		hdfc.Age=27;
		hdfc.Experienceinyeares=03;
		hdfc.Bankingsector();
		hdfc.totalemployees();
		hdfc.femaleemployees();
		hdfc.maleemployees();
		
		System.out.println("Hdfc Slno= "+hdfc.Slno);
		System.out.println("Hdfc Branchname= "+hdfc.Branchname);
		System.out.println("Hdfc Managername= "+hdfc.Managername);
		System.out.println("Hdfc Location= "+hdfc.Location);
		System.out.println("Hdfc PinCode= "+hdfc.PinCode);
		System.out.println("Hdfc Contactnumber= "+hdfc.Contactnumber);
		System.out.println("Hdfc Provideshouseloan= "+hdfc.Provideshouseloan);
		
		
		/*System.out.println("Hdfc Total Employees= "+hdfc.Total);
		System.out.println("Hdfc Female Empoyees= "+hdfc.Female);
		System.out.println("Hdfc Male Employees= "+hdfc.Male);*/
		
		if (hdfc.Age<=25) {
			System.out.println("You are Eligible to Become a Emploee...");
				
			}
		
		else if(hdfc.Experienceinyeares>=3) {
			System.out.println("You are Eligible.....");
		}
		else {
			System.out.println("Not Eligible.....");
			
		}
		

				
		
	
	}

}
