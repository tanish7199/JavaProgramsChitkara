import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class random_number{
	int random_no;
	char alphabet;	
	void getRandom_no(int random_no){
		this.random_no = random_no;
	}
	void findAlphabet(){
		char alphabet = (char)random_no;
		this.alphabet = alphabet;
	}
	char setAlphabet(){
		return alphabet;
	}
	int findKeyPad(){
		int key;
		switch(alphabet){
			case 'A': key=2;
			case 'B': key=2;
			case 'C': key=2;
			case 'D': key=3;
			case 'E': key=3;
			case 'F': key=3;
			case 'G': key=4;
			case 'H': key=4;
			case 'I': key=4;
			case 'J': key=5;
			case 'K': key=5;
			case 'L': key=5;		
			case 'M': key=6;
			case 'N': key=6;
			case 'O': key=6;
			case 'P': key=7;
			case 'Q': key=7;
			case 'R': key=7;
			case 'S': key=7;
			case 'T': key=8;
			case 'U': key=8;
			case 'V': key=9;
			case 'W': key=10;
			case 'X': key=10;
			case 'Y': key=10;
			case 'Z': key=10;
			default: key=0;
		}
		return key;
	}
	public static void main(String[] args){
		int randomNum = ThreadLocalRandom.current().nextInt(1,26);
		random_number rn = new random_number(); 
		rn.getRandom_no(randomNum);
		char alpha = rn.setAlphabet();
		int keyPad = rn.findKeyPad();
		System.out.println(randomNum+alpha+keyPad);
	}
}