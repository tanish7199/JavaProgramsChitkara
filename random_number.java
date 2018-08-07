import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class random_number{
	int random_no;
	char alphabet;	
	void getRandom_no(int random_no){
		this.random_no = random_no;
	}
	void findAlphabet(){
		int i=2;
		char alphabet = 'A';
		while(i<=random_no){
			alphabet++;
			i++;
		}
		this.alphabet = alphabet;
	}
	char setAlphabet(){
		return alphabet;
	}
	int findKeyPad(){
		int key=2,ke=1;
		for(ke;ke<=26;ke++){
				key++;	
			}
		/*switch(alphabet){
			case 'A': key=2; break;
			case 'B': key=2; break;
			case 'C': key=2; break;
			case 'D': key=3; break;
			case 'E': key=3; break;
			case 'F': key=3; break;
			case 'G': key=4; break;
			case 'H': key=4; break;
			case 'I': key=4; break;
			case 'J': key=5; break;
			case 'K': key=5; break;
			case 'L': key=5; break;	
			case 'M': key=6; break;
			case 'N': key=6; break;
			case 'O': key=6; break;
			case 'P': key=7; break;
			case 'Q': key=7; break;
			case 'R': key=7; break;
			case 'S': key=7; break;
			case 'T': key=8; break;
			case 'U': key=8; break;
			case 'V': key=9; break;
			case 'W': key=9; break;
			case 'X': key=9; break;
			case 'Y': key=9; break;
			case 'Z': key=9; break;
			default: key=0;
		}*/
/* 
	ren =1;
	num = num+2 //three alphabets in one key
	key = num/3 +1
	num==21 or num==28 --> key--; 
*/
		return key;
	}
	public static void main(String[] args){
		int randomNum = ThreadLocalRandom.current().nextInt(1,26);   //int num = rand.nextInt(26) + 1;
		random_number rn = new random_number(); 
		rn.getRandom_no(randomNum);
		rn.findAlphabet();
		char alpha = rn.setAlphabet();
		int keyPad = rn.findKeyPad();
		System.out.println("Random number: "+ randomNum);
		System.out.println("Alphabet:  "+alpha);
		System.out.println("Key :"+keyPad);
	}
}