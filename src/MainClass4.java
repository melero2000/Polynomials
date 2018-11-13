
public class MainClass4 {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		System.out.println( rec );
		rec.moveTo(4, 7);
		System.out.println( rec );
		
		//ej30
		Point p1 = new Point(1, 1);
		Rectangle rec2 = new Rectangle(p1, 8, 6);
		System.out.println(rec2);
		
		Point p2a = new Point(2,2);
		Point p2b = new Point(10,8);
		Rectangle rec3 = new Rectangle(p2a, p2b);
		System.out.println(rec3);
		
		System.out.println("The area is " + rec3.getArea());
		
		System.out.println("Top left point: " + rec3.getTopLeftPoint());
		System.out.println("Top right point:" + rec3.getTopRightPoint());
		System.out.println("Bottom left point: " + rec3.getBottomLeftPoint());
		System.out.println("Bottom right point: " + rec3.getBottomRightPoint());
	}
	

}