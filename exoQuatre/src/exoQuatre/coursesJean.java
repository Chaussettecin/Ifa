package exoQuatre;
import java.util.HashMap;


public class coursesJean {

	public static void main(final String[] args) {

		HashMap<String, Float> maMap = new HashMap<String, Float>();

//Liste des éléments des courses + prix 
		   maMap.put("Salade" , (float) 1.03);
		   maMap.put("Tomate" , (float) 2.30);
		   maMap.put("Oignon" , (float) 1.85);
		   maMap.put("Chou rouge" , (float) 0.85);
	
//Programme qui calcule le prix total de ses courses
		Float sum = 0f;
			for (Float val : maMap.values()){
			   sum += val;
		//sum = (Math.round((sum*1000)/1000));
			}
			//double totalCourses = 0.0d;
			
			//for(String product : courses.keySet()) {
				//totalCourses += courses.get(product); 
			//}
			
			///System.out.println("Total des courses : " + totalCourses);

			
			
			System.out.println("Bonjour Jean : ");  
			System.out.println("    ");  
			System.out.println ("Voci votre liste des élements :");
			System.out.println("Nombres de produit dans la liste " + maMap.size());
			System.out.println("    ");
			System.out.println(maMap.values());
			System.out.println("-----------------------------------");
			System.out.println("Le total de vos courses est de "+ sum +" €");
		   }
}
	
