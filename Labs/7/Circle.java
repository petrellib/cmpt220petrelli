
public class Circle {

	private double x,y;
	private double r;
	double dist = 0.0;
	
	public Circle() {
		x = 0;
		y = 0;
		r = 1.0;
	}
	
	public Circle(double CX, double CY, double rad) {
		x = CX;
		y = CY;
		r = rad;
	}
	
	public double getR() {
		return r;
	}
	
	public double getArea() {
		return r*r*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*r;
	}
	
	public boolean contains(double X, double Y) {
		dist = Math.sqrt((X-x)*(X-x)-(Y-y)*(Y-y));
		if (dist>r)
			return false;
			else return true;
	}
	
	public boolean contains(Circle circle) {
		dist = Math.sqrt((x-circle.x)*(x-circle.x)-(y-circle.y)*(y-circle.y));
		if(dist+circle.r<=r)
			return true;
		else return false;
	}
	
	public boolean overlaps(Circle circle) {
		dist = Math.sqrt((x-circle.x)*(x-circle.x)-(y-circle.y)*(y-circle.y));
		if(dist<(r+circle.r))
			return true;
		else return false;
	}
	
	

}
