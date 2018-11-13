
public class Polygon {
	
	private Point[] points;
	
	//esto es un constructor
	public Polygon(Point[] points) {
		this.points = points;
	}
	
	//constructor sin parametros
	public Polygon() {
		points = null;
	}
	
	@Override
	public String toString() {
		String s = "";
		for ( Point p: points) {
			s = s + p.toString() + " - ";
		}
		s = s + points[0];
		return s;
	}
	
	public double calculatePerimeter(Point[] points) {
		double perimeter = 0;
		Segment seg;
		for (int i = 0; i < points.length -1 ; i++) {
			seg = new Segment(points[i], points[i+1]);
			perimeter = perimeter + seg.module();
		}
		seg = new Segment(points[points.length - 1], points [0]);
		perimeter = perimeter + seg.module();
		return perimeter;
	}
	
	public void setOffset(int offX, int offY) {
		for (int i = 0; i < points.length -1 ; i++) {
			points[i].setOffset(offX, offY);
		}
	}
}
