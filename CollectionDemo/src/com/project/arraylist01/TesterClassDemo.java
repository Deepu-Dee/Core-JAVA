package com.project.arraylist01;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesterClassDemo {
	public static void main(String[] args) {
		MobileBrands brands=new MobileBrands(1, "IPHONE", "Black", 2020, 80000);
		MobileBrands brands1=new MobileBrands(2, "SamSung", "Gold", 2016, 15000);
		MobileBrands brands2=new MobileBrands(3, "MI", "Blue", 2021, 19000);
		
		List<MobileBrands> mobile=new ArrayList<MobileBrands>();
		mobile.add(brands);
		mobile.add(brands1);
		mobile.add(brands2);
		
		
		System.out.println(mobile);
		
		
	/*by using for each loop method*/
		
		for(MobileBrands mobile1:mobile) {
			System.out.println(mobile1);
		}
		
		/*Iterator Interface Method*/
		
		Iterator<MobileBrands> mobile2=mobile.iterator();
		while(mobile2.hasNext()) {
			System.out.println(mobile2.next());
			
		}
	}

}
