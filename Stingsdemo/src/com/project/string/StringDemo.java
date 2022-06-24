package com.project.string;

public class StringDemo {
public static void main(String[] args) {
	String string=new String("ganesh");
	String string1=new String("deepa");
	String string2=new String("roopa");
	System.out.println(string);
	System.out.println(string1);
	System.out.println(string2);
	System.out.println(string.hashCode());
	System.out.println(string1.charAt(1));
	System.out.println(string.isEmpty());
	System.out.println(string.concat(string1).concat(string2));
	System.out.println(string.toLowerCase());
	System.out.println(string.toUpperCase());
	System.out.println(string.toString());
}
	
}

