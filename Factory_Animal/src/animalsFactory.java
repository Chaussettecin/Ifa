

public abstract class animalsFactory {
	
	private String Type;
	
	public animalsFactory getAnimal(String string) {
		return getAnimal(null);
	}

	public abstract void sound(String string);

	
/// Getter ------ Setter 
	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	public String setAnimal(String Type) {
		return Type;
	}


}
