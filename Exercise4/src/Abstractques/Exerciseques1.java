package Abstractques;

abstract class Parent{
	void message() {
	}
}
		
class firstsub extends Parent{
	void message() {
		System.out.println("This is first subclass");
	}
}
class secondsub extends Parent{
	void message() {
		System.out.println("This is second subclass");
	}
}

public class Exerciseques1 {

	public static void main(String[] args) {
		firstsub obj = new firstsub();
		secondsub obj2 = new secondsub();
		
		obj.message();
		obj2.message();
	}
}
