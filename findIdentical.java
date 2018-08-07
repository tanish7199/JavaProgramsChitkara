import java.util.Scanner;

class findIdentical{
	int[] A = {1,5,4,3,9,2,9};
	int size=0;
	int[] count ={0,0,0,0,0,0,0,0,0};
	void find(){
		for(int i=0;i<A.length;i++){
				if(count[A[i]]!=0){
					System.out.println(A[i]);
					}
				else count[A[i]] = 1;
				}
		}
	public static void main(String[] args){
		findIdentical first = new findIdentical();
		first.find();
		}
}