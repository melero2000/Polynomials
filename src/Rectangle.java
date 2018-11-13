
public class Rectangle extends Point {
	
	private int width;
	private int height;


	public Rectangle() {
		super();
		width = 0;
		height = 0;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " Width: " + width + " Height: " + height;

	}
	//ej29
	public Rectangle (Point p, int newWidth, int newHeight) {
		super( p.getX(), p.getY() );
		width = newWidth;
		height = newHeight;
	}
	
	public Rectangle(Point p1, Point p2) {
		super(p1.getX(), p1.getY());
		width = p2.getX();
		height = p2.getY();
	}
	
	
	//public Rectangle(Segment segment) {
		//int x1 = segment.getStartPoint().getX();
	//int y1 = segment.getStartPoint().getY();
	//int x2 = segment.getEndPoint().getX();
	//int y2 = segment.getEndPoint().getY();

	//if (x1 < x2 ) {
	//	setX(x1);
	//	} else {
	//	setX(x2);
			//	}
			//	if ( y1 < y2) {
			//		setY(y1);
			//	} else {
			//setY(y2);
			//	}
		//width = Math.abs(x1 - x2);
		//height = Math.abs(y1 - y2);
		
	//}
	
	public int getArea() {
		int area = width * height;
		return area;
	} 
	
	public Point getPoint() {
		Point p = new Point(getX(), getY());
		return p;
	}
	
	public Point getTopLeftPoint() {
		Point p = new Point(getX(), getY() + height );
		return p;
	}
	
	public Point getTopRightPoint() {
		Point p = new Point(getX() + width , getY() + height );
		return p;
	}
	
	public Point getBottomLeftPoint() {
		return getPoint();
	}
	
	public Point getBottomRightPoint() {
		Point p = new Point(getX() + width, getY());
		return p;
	}	
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	
	
	
}