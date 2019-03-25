package exoQuatre;

import java.util.Hashtable;


public class music {

	public static void main(final String[] args) {

	Hashtable<String,Hashtable<String,String>> musique = new Hashtable<String, Hashtable<String, String>>();

        //création de la collection Rap 	
		Hashtable<String, String> rap = new Hashtable<String, String>();
        			musique.put("Rap",rap);
        			rap.put("0","Eminem");
        			rap.put("1","IAM");

        
       //création de la collection Pop 
        Hashtable<String, String> pop = new Hashtable<String, String>();

        			musique.put("Pop",pop);
        			pop.put("0","Madonna");
        			pop.put("1","Katy Perry");

        
        //création de la collection Rock 
        Hashtable<String, String> rock = new Hashtable<String, String>();

        			musique.put("Rock",rock);
        			rock.put("0","Pink Floyd");
        			rock.put("1", "AC/DC");

        System.out.println("Tout pour la musique : ");	
        System.out.println("  ");
        System.out.println(musique);
			}
		}
