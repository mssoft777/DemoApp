package com.app.model;

/**
 * 
 * @author HP
 *
 *   == operator always compare references, if both the references pointing to the same object then return true else false
 *   .equals method always compare content if both objects content is same then return true else false
 */

public class EqualAndDoubleEqual {
	
	public static void main(String[] args) {
		String s1="mahi"; // object created in string constant pool
		String s2= new String("mahi"); // object created in heap memory
		String s3="mahi";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
