
public class drawShape {

//-- Class correspondante à la facade -
	  
	private shape cercle;
	private shape rectangle;
	private shape triangle;

	  
	public drawShape() {
	      cercle = new cercle();
	      rectangle = new rectangle();
	      triangle = new triangle();
	   }

	public void drawCercle(){
	   cercle.draw();
	}
	  
	public void drawRectangle(){
	   rectangle.draw();
	}
	  
	public void drawTriangle(){
	   triangle.draw();
	}
	
}
