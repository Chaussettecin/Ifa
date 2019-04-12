import java.util.Random;

public class dice {

	private int face;
	private Random rand;
	
	public dice(int face) {
		this.face = face;
		this.rand = new Random();
	}
	
	public synchronized int lancer() {
		return (rand.nextInt(face)+1);
	}
	
	public static void main(String[] args) {
		dice des = new dice(6);
		for(int i=0; i<10; i++)
			System.out.println(des.lancer());
	}
}
