import java.util.Scanner;

class Hello {
	public static void main(String[] args){
		if(args.length>0){
			System.out.println("The command line arguments are:");
			for(String val:args){
				System.out.println(val);
			}
		}
		else
			System.out.println("No such command line arguments found, please try again");
	}
}