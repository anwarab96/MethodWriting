package com.assignmentalfk;
 class CreateConstructor {
	 int value1;
	 int value2;
	 CreateConstructor()
	 {
		value1=10;
		value2=20;
		System.out.println("Inside the constructor");
	 }
	 CreateConstructor(int a){
		 value1 = a ;
		// value2 = a ;
		 System.out.println("Inside the 2nd constructor");
	 }
	 CreateConstructor(int a, int b){
		 value1=a;
		 value2 = b;
		 System.out.println("Inside the 3rd constructor");
	 }
	 public void display(){
		 System.out.println("Value1=== " + value1);
		 System.out.println("Value2=== " + value2);
	 }
	 public static void main(String args[]){
		 CreateConstructor cc1= new CreateConstructor();
		 CreateConstructor cc2= new CreateConstructor(45);
		 CreateConstructor cc3= new CreateConstructor(25,50);
		cc1.display();
		cc2.display();
		cc3.display();
	 }
}
