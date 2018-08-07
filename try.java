import java.util.Scanner;
class try1{
	int a,b;
	String c;
	int d;
	void input(){
Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		c = sc.next();
	
		d = sc.nextInt();
System.out.println(a);
System.out.println(b);
		System.out.println(d);
		}
	public static void main(String[] args){
	try1 t = new try1();
	t.input();
	}
}