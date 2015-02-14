package com.assignmentalfk;
 class ConstuctorChaining 
 {
	 int value1;
	 int value2;
	 ConstuctorChaining()
	 {
		value1=10;
		value2=20;
		System.out.println("Inside the constructor");
	 }
	 ConstuctorChaining(int a)
	 {
		 value1 = a ;
		// value2 = a ;
		 System.out.println("Inside the 2nd constructor");
	 }
	 ConstuctorChaining(int a, int b)
	 {
		 value1=a;
		 value2 = b;
		 System.out.println("Inside the 3rd constructor");
	 }
	 public void display()
	 {
		 System.out.println("Value1=== " + value1);
		 System.out.println("Value2=== " + value2);
		 }
	 public static void main(String args[])
	 {
		 ConstuctorChaining1 cc1= new ConstuctorChaining1();
		
		cc1.display();
		
	 }
 }
class ConstuctorChaining1 extends ConstuctorChaining
	 {
	int value3;
	int value4;
	ConstuctorChaining1()
	{
		super(5);
		value3 = 30;
		value4= 40;
		System.out.println("inside the constructor of ConstuctorChaining1");
	}
	 public void display()
	 {
		 System.out.println("Value1=== " + value1);
		 System.out.println("Value2=== " + value2);
		 System.out.println("Value1=== " + value3);
		 System.out.println("Value2=== " + value4);
		 
	 }
		 
	 

}

