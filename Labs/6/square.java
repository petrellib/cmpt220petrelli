import java.util.*;

public class square {
		
	private double width;
	
	public square() {
		width = 1.0;
	}
	
	public void setWidth(double wid) {
		width = wid;
	}
	
	public double getArea() {	
		return width*width;
	}
	
	public double getPerimeter() {
		return 4*width;
	}

	
	
}




