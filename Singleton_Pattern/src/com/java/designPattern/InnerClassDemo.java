package com.java.designPattern;
class Outer{
	private int num =175;
	
	public class inner{
		public int getNum(){
			System.out.println("The private member of the outer class is accesed ");
			return num;
		}
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		   Outer out=new Outer();
		   Outer.inner in=out.new inner();
		   System.out.println(in.getNum());
		   
	}
  
}
