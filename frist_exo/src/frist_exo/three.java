package frist_exo;

public class three {
	
	public static void main (String args []) {
		
	//création d'un tableau de val numerique
		//int monTableau[] = new int[6];
		//monTableau[0] = 20; 
		//monTableau[1] = 30;
		//monTableau[2] = 5;
		//monTableau[3] = 90;
		//monTableau[4] = 10;
		//monTableau[5] = 70;
			
		int tableauNbre[]= {20,30,5,90,10,70};
	
		
		//Afficher la valeur du 5eme élement
		System.out.println("La valeur du" + "5eme" + "le chiffre est = " + tableauNbre[5]);
		    
		
		//+ 5 au 5eme element
		//for (int i = 0; i < tableauNbre.length; i++); {

		//int x = 70;
		//x = x + 10;
		//x+=10;
		tableauNbre[5] +=5;
		System.out.println("le cinquième élément avec " + "+5 =" + tableauNbre[5]);
		
		//}
		
		//-2 au 3eme element
		System.out.println("le troisième élément avec " + "-2 =" + tableauNbre[3]);
	}
}

