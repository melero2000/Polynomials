
public class MainClassSegment2 {

	public static void main(String[] args) {
		
		Segment segment = new Segment (new Point(4,5), new Point (6,8));
		segment.setOffset(4, 4);
		System.out.println(segment.toString());
		Point[] points = { new Point(2,2), new Point (2,4), new Point (4,4), new Point (4,2) };
		
		System.out.println(calculatePerimeter(points));
		
		Polygon pol = new Polygon(points);
		System.out.println(pol);
		pol.setOffset(5, 3);
		System.out.println(pol); 
		
	}	
	public static double calculatePerimeter(Point[] points) {
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
}
