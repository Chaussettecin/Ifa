
public abstract class Friandise extends Animals {

    protected String espece;
    protected String type;
    protected String marque;
    

//--- Constructeur ---     
    public Friandise(String espece, String type, String marque){
        this.espece =espece;
        this.type = type;
        this.marque = marque;
    
    }
    
    
//--- Getter ---
    public String getEspece() {
        return this.espece;
    }
 
    public static String getType(String type) {
        return type;
    }
    
    public String getMarque() {
        return marque;
    }
 
//--- Setter --
    
    public String setEspece() {
        return this.espece;
    }
 
    public static String setType(String type) {
        return type;
    }
     
    public String setMarque() {
        return marque;
    }
    
   
}

