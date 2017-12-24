package com.acc.collectionDemo;
import java.util.*;
public class TreeSetSortingEmployee {
	

	public static void main(String[] args) 
	{
		Employee e1=new Employee("raj", 29);
		Employee e2=new Employee("ravi", 45);
		Employee e3=new Employee("vishal",16);
		Employee e4=new Employee("rahul", 33);
		
		//Employee e5=new Employee("ravi",45);
		
		TreeSet t1=new TreeSet(); //DNSO 
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		//t1.add(e5);
		System.out.println("\n D N S O is \n"+t1);
		
		TreeSet t2=new TreeSet(new MyComparator()); //Own Comparator
		
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		//t2.add(e5);
		System.out.println("\n Own order is  is \n"+t2);
		
		
		
	}

}
class Employee implements Comparable
{ 
	int eid;
	String ename;
	

	Employee(String ename,int eid) 
	{
		
		this.ename=ename;
		this.eid=eid;
	}
	public String toString() 
	{
	return ename+"("+eid+")";
	}
	public int compareTo(Object ob) // D.N.S.O by eid ASCE
	{
		int eid1=this.eid;
		Employee e=(Employee) ob;
		int eid2=e.eid;
		
		if(eid1<eid2)
		
			return -1;
		
		else if(eid1>eid2)
		
				return +1;
			else
				return 0;
	}
	
}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		String s1=e1.ename;
		String s2=e2.ename;
		
		return s1.compareTo(s2);
		
		
		
	}
	
}