package com.project.arraylist;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
public static void main(String[] args) {
	List<String> list=new java.util.ArrayList<String>();
	list.add("Ganesh");
	list.add("Deepa");
	list.add("Roopa");
	list.add("Pavan");
	System.out.println(list);
	
	/*For Each loop Method*/
	
	for(String str:list) {
		System.out.println(str);
		
	}
	/*Iterator Interface Method*/
	
	Iterator<String>itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
			
}
	
}
