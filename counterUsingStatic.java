import java.util.Scanner;

class Counter{
	static int count = 0;
	Counter(){
		count++;
	}
	public static void main(String args[]){
		Counter c1 = new Counter();
		System.out.println("On calling with class name: " + Counter.count);
		System.out.println("On calling with object name: " + c1.count);
		Counter c2 = new Counter();
		System.out.println("On calling with class name: " + Counter.count);
		System.out.println("On calling with object name: " + c1.count);
		Counter c3 = new Counter();
	}
}