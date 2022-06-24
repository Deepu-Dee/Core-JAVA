package com.project.bank2;

public class TesterSbiVariables {
	public static void main(String[] args) {
		SbiVariables sbivariables=new SbiVariables();
		
		sbivariables.Slno=18;
		sbivariables.IsthisprovideMedicalInsurance=true;
		sbivariables.ManagerName="Rashi";
		sbivariables.Sbi();
		
		System.out.println("SbiVariables Slno= "+sbivariables.Slno);
		System.out.println("SbiVariables IsthisprovideMedicalInsurance= "+sbivariables.IsthisprovideMedicalInsurance);
		System.out.println("SbiVariables ManagerName= "+sbivariables.ManagerName);
		System.out.println("SbiVariables Total Employees= "+sbivariables.sub);
	}

}
