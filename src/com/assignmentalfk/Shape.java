package com.assignmentalfk;
//LearnAbsNFinKewords

	abstract class Shape{
	final	int base = 20;
		public void display(){
			System.out.println("This is a display method");
		}
		abstract public void calculateArea();
	}
	class Rectangle extends Shape{
		public static void main(String args[]){
			Rectangle obj = new Rectangle();
			obj.display();
			//obj.base=200;//base is finall so can not be change
			//calculateArea();
		}

		public void calculateArea() {
				// TODO Auto-generated method stub
				double width = 25.0;
				double height=45.15;
				double area = width*height;
				System.out.println("The area is " + area);
			}
		}
	
	

