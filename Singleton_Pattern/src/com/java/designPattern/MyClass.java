package com.java.designPattern;

class Outer_class{
	int num;
	
	private class Inner_class{
		public void print(){
			System.out.println("The inner class is called . . . ");
			}
	}
	void inner_display(){
		Inner_class inner= new Inner_class();
		inner.print();
	}
}
public class MyClass {

	public static void main(String[] args) {
		Outer_class outer=new Outer_class();
		outer.inner_display();
	}

}
