package packageb;

import packagea.ClassA;

public class ClassB {
	public static void main(String args[]){
		ClassA a = new ClassA();
		System.out.println("Got It");
		System.out.println(a.name);
	}
}