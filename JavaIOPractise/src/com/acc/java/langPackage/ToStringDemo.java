package com.acc.java.langPackage;

import java.util.*;

public class ToStringDemo {

	public static void main(String[] args) 
	{
		Student s=new Student("rajesh",1229);
		System.out.println(s.toString());
		System.out.println(s);
		ToStringInListDemo.addSomeElements();
		
		

	}

}
class Student
{
	String name;
	int rollno;
	public String toString()
	{
		return name+" "+rollno;
		
	}
		Student(String name,int rollno)
		{
			this.name=name;
			this.rollno=rollno;
			
		}
		
}

class ToStringInListDemo
{
	static ArrayList l=null;
	public static void addSomeElements()
	{
		l=new ArrayList();
		System.out.println(l.size());
	}
	
}