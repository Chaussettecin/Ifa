package frist_exo;

public class exoMulti {
	
	public static void main(String[] args) {
		
	//initialise le tableau 0 à 09
		int tableSize = 9;
			printMultiplicationTable(tableSize);
	}
		
	// 1 - Tableau de multiplication de 2
		//int num = 2;
		//for(int i = 1; i <= 10; ++i)
		//{
		//System.out.printf("%d * %d = %d \n", num, i, num * i);
		//}
	   
		//int num = 9, i = 1;
		//While(i <= 10)
		//{
		//System.out.printf("%d * %d = %d \n", num, i, num * i);
		//i++;
		//}

	
	// 2 - Table de multiplication de 1 à 10.
	public static void printMultiplicationTable(int tableSize) {
			
		//mise en page du tableau a deux entrées
			System.out.format("      ");
			
		for(int i = 1; i<=tableSize;i++ ) {
			System.out.format("%4d",i);
				}
			
			System.out.println();
		//decorum du tableau 
			System.out.println("------------------------------------------");
			
		for(int i = 1 ;i<=tableSize;i++) {
			System.out.format("%4d |",i);
			
		for(int j=1;j<=tableSize;j++) {
				System.out.format("%4d",i*j);
			}
				System.out.println();
			}
		}
	}

