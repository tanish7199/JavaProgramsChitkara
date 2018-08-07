import java.util.Scanner;
import java.util.Arrays;

class number{
	int size;
	int arr[] = new int[100];
	int largest(){	
		int i;
		int big = arr[0];
		for(i=1;i<size;i++)
			if(arr[i]>big)
				big = arr[i];
		return big;
	}
	int smallest(){
		int i;
		int small = arr[0];
		for(i=1;i<size;i++)
			if(arr[i]<small)
				small = arr[i];
		return small;
	}
	void getArr(int arr[]){
		this.arr = Arrays.copyOf(arr,arr.length);
                /*for(int i=0;i<size;i++)
                	this.arr[i] = arr[i];*/
	}
	void getSize(int size){
		this.size = size;	
	}	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();	
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		number n = new number();
		n.getArr(arr);
		n.getSize(size);
		int small = n.smallest();
		int largest = n.largest();	
		System.out.println("The smallest element is "+small);
		System.out.println("The largest element is "+largest);	
	}
}