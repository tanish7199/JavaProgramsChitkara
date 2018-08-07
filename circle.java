import java.util.Scanner;

class Circle{
		private double radius = 1.0;
		private String color = "red";
		Circle(){
			this.radius = 1.0;
			this.color = "red";
		}
		Circle(double r){
			this.radius = r;
		}
		double getRadius(){
			return radius;
		}
		double getArea(){
			return 3.14*radius*radius;
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double radius1;
		radius1 = sc.nextDouble();
		Circle cc = new Circle(radius1);
		double s = cc.getArea();
		System.out.println(s);
	}
}