public class PolynomialTest {

	public static void main(String[] args) {
		MyPolynomial p1 = new MyPolynomial(2, 2, 1, 2);
		MyPolynomial p2 = new MyPolynomial(1, 1, 2);
	
		System.out.println(p1.multiply(p2));
	}
}
