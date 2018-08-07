import java.util.Arrays;
import java.io.*;

class pairSum{
	int arr[] = new int[100];
	int size;
	int number;
	void getArr(int arr[]){
		this.arr = Arrays.copyOf(arr,arr.length);
	}
	void getSize(int size){
		this.size = size;
	}
	void getNumber(int number){
		this.number = number;
	}
	void find(){
		int i;
		for(i=0;i<size-1;i++)
			if(number==(arr[i]+arr[i+1])){
				System.out.println("One such pair is " + arr[i] +" and "+ arr[i+1]);
			}
	}
	public static void main(String args[]) throws IOException{
		pairSum s = new pairSum();
		int size;
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(bc.readLine());
		s.getSize(size);
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = Integer.parseInt(bc.readLine());
		}
		s.getArr(arr);
		System.out.println("Enter the number to which you want to compare the array");
		int number = Integer.parseInt(bc.readLine());		
		s.getNumber(number);
		s.find();
	}
}