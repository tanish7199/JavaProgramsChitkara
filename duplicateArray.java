import java.util.Scanner;
import java.util.Arrays;

class duplicate{
	int arr[] = new int[100];
	int size;
	void getArr(int arr[]){
		this.arr = Arrays.copyOf(arr,arr.length);
	}
	void getSize(int size){
		this.size = size;
	}
	void findDuplicate(){
		int count[] = new int[100];
		for(int i=0;i<size;i++){
			if(count[arr[i]]!=0)
				arr[i]=0;
			else 
				count[arr[i]]++;
		}
	}
	void output(){
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++)		
			arr[i] = sc.nextInt();
		duplicate dp = new duplicate();
		dp.getArr(arr);
		dp.getSize(size);
		dp.findDuplicate();
		dp.output();			
	}
}