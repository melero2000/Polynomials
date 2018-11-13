
public class TestMyTriangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(0, 0, 1, 1, 2, 2);
		System.out.println(t1);
		System.out.println(t1.getPerimeter());
		t1.printType();
	}

}
