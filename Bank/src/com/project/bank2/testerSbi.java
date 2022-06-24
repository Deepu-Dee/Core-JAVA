package com.project.bank2;

public class testerSbi {
	public static void main(String[] args) {
		SbiJava sbijava=new SbiJava();
		
		sbijava.Slno=88;
		sbijava.Branchname="SBI";
		sbijava.Managername="RAM";
		sbijava.Phonenumber=9980369438L;
		sbijava.openingTime="10.30AM";
		sbijava.isprovidesstudentloan=true;
		sbijava.Sbi();
		
		System.out.println("Sbi Slno= "+sbijava.Slno);
		System.out.println("Sbi BranchName= "+sbijava.Branchname);
		System.out.println("Sbi Managername= "+sbijava.Managername);
		System.out.println("Sbi Phonenumber= "+sbijava.Phonenumber);
		System.out.println("Sbi Openingtime= "+sbijava.openingTime);
		System.out.println("Sbi IsprovidesStudentloan= "+sbijava.isprovidesstudentloan);
		
		
		
		
		
	}

}
