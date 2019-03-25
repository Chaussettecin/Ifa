package frist_exo;

public class corre {
	
	
	
	public static void main(String args []) {

		
		int exArray[] = new int [] {1, 2 ,3, 4, 5, 7,8,10} ;
		
		int missingNumber = 0; 
		
		for (int i=0; i<exArray.length; i++) {
			missingNumber += i; 
		}
		
		System.out.println("Mon tableau : " + missingNumber);
}
}