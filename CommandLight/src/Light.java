

public class Light {

	private String lightRoom;
	
	public Light (String lightRoom) {
		this.lightRoom = lightRoom;
	}
	
	public void open() {
		System.out.println("La lumière de " + lightRoom + " est allumée");
	}
	
	public void close() {
		System.out.println("La lumière de " + lightRoom + " est eteinte");
	}
}