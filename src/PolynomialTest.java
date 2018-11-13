public class PolynomialTest {

	public static void main(String[] args) {
		MyPolynomial p1 = new MyPolynomial(1, 2, 3, 6);
		MyPolynomial p2 = new MyPolynomial(2, 3, 2);

		System.out.println(p1.add(p2));
	}
}
