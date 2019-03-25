package exoSdeux;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner; 


//char userChar = scanner.next().charAt(0);
//char userChar = JOptionPane.showInputDialog().charAt(0);

public class tabDynamique {
	public static void main(String args[]){

System.out.println("-- EXERCICE 1 --");
		
		Scanner userInput = new Scanner(System.in);
		char exArray[] = new char[0];
		char newArray[];
		
		System.out.println("-- Entrez le premier caractère : --");
		
		char userChar = ' ';
		userChar = userInput.next().charAt(0);
		//System.out.println("You typed " + userChar);
		//exArray[0]=userChar;
		
		while(userChar != '.') {
			newArray = new char[exArray.length+1];
			
			for(int i = 0; i<exArray.length; i++) {
				newArray[i] = exArray[i];
			}
			
			newArray[newArray.length-1] = userChar;
			exArray = newArray;
			
			// Input part
			System.out.println("Enter new Char or exit with '.'");
			userChar = userInput.next().charAt(0);

		}
		
		// free
		userInput.close();
		
		System.out.println("-- Exit the input --");
		System.out.println("This is your final Array : " + Arrays.toString(exArray));

	}
	
}
	
	

	