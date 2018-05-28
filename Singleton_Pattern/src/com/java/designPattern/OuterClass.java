package com.java.designPattern;

public class OuterClass {
	int num=134;
	
	int my_method(){
		class inner{
			public int print(){
				System.out.println("inside the method inner class");
				return num;
				
			}
		}
		inner in=new inner();
		//in.print();
		return in.print();
	}

	public static void main(String[] args) {
	OuterClass out=new OuterClass();
	System.out.println(out.my_method());

	}

}
