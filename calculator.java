import java.util.Scanner;
class calculator{
	int i, j;
	void input(){
		Scanner first = new Scanner(System.in);
		Scanner second = new Scanner(System.in);
		i = first.nextInt();
		j = second.nextInt();
		}
	void add(){
		System.out.println("Addition");
		System.out.println(i+j);
		}
	void multi(){
		System.out.println("Multiplication");
		System.out.println(i*j);
		}
	void sub(){
		System.out.println("Subtraction");
		System.out.println(i-j);
		}	
	void div(){
		System.out.println("Division");
		System.out.println(i/j);
		}
	public static void main(String[] args) {
	calculator object = new calculator();
	object.input();
	object.add();
	object.multi();
	object.sub();
	object.div();
	}
}