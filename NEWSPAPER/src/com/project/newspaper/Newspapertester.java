package com.project.newspaper;

public class Newspapertester {

	public static void main(String[] args) {
		System.out.println("adition of 2 numbers="+Newspaper.sum);
		System.out.println("subtraction of 2 numbers="+Newspaper.sub);
		System.out.println("multiplication of 2 numbers="+Newspaper.mul);
		System.out.println("division of 2 numbers="+Newspaper.div);
		
		Newspaper newspaper=new Newspaper();
		newspaper.sno=01;
		newspaper.name="PRAJAVANI";
		newspaper.color="BLACK&WHITE";
		newspaper.pageno=1;
		newspaper.contactno=9606643321L;
		newspaper.givesinformation();
		
		System.out.println("NEWSPAPER SLNO :"+newspaper.sno);
		System.out.println("NEWSPAPER NAME :"+newspaper.name);
		System.out.println("NEWSPAPER COLOR :"+newspaper.color);
		System.out.println("NEWSPAPER PAGENO :"+newspaper.pageno);
		System.out.println("NEWSPAPER CONTACT NO :"+newspaper.contactno);
		
	System.out.println("=================================================================");	
		
		Newspaper newspaper2=new Newspaper();
		newspaper2.sno=02;
		newspaper2.name="VIJAYAVANI";
		newspaper2.color="COLOR";
		newspaper2.pageno=5;
		newspaper2.contactno=1236549875L;
		newspaper2.givesinformation();
		
		System.out.println("NEWSPAPER SLNO :"+newspaper2.sno);
		System.out.println("NEWSPAPER NAME :"+newspaper2.name);
		System.out.println("NEWSPAPER COLOR :"+newspaper2.color);
		System.out.println("NEWSPAPER PAGENO :"+newspaper2.pageno);
		System.out.println("NEWSPAPER CONTACT NO :"+newspaper2.contactno);
		

		
	}
}
