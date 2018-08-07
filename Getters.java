import java.util.Scanner;

class get{
int a,b;
String c;
	int getInt(){
		return a;
	}
	void setInt(int x){
		this.a=x;
	}
	int getIntSecond(){
		return b;
	}
	void setIntSecond(int y){
		this.b = y;
	}
	void setString(String q){
		this.c = q;
	}
	String getString(){
		return c;
	}
public static void main(String[] args){
	int w,x;
	String l;
	Scanner sc = new Scanner(System.in);
	get q = new get();
	w = sc.nextInt();
	q.setInt(w);
	x = sc.nextInt();
	q.setIntSecond(w);
	l = sc.next();
	q.setString(l);
}	
}