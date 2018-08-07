import java.util.Scanner;
import java.lang.*;

class Hello {
	public static void main(int args){
		if(args.length>0){
			System.out.println("The command line arguments are:");
			for(int val:args){
				int flag = 0;
				flag=flag+args;
				System.out.println(flag);
			}
		}
		else
			System.out.println("No such command line arguments found, please try again");
	}
}