package exoSdeux;
import java.util.Scanner;

public class exoThree {
//L'utilisateur tape un mot et le programme teste si c'est un palindrome ou pas.

	public static void main(String args[]) {
	      String original, reverse = ""; 
	      
	      Scanner in = new Scanner(System.in);
	     
	      //On invite l'user à taper un mot
	      	System.out.println(" ?????? --Entrer un mot : --?????? ");
	      original = in.nextLine();
	      //On garde le mot.
	      
	      int length = original.length();
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse))
	         System.out.println("--------Ce mot est un palindrome ---------");
	      else
	         System.out.println("********* Ce mot n'est pas un palindrome *********");     
	   }
}
