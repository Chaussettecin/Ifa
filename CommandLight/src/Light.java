

public class Light {

	private String lightRoom;
	
	public Light (String lightRoom) {
		this.lightRoom = lightRoom;
	}
	
	public void open() {
		System.out.println("La lumi�re de " + lightRoom + " est allum�e");
	}
	
	public void close() {
		System.out.println("La lumi�re de " + lightRoom + " est eteinte");
	}
}