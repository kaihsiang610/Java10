class Caaa4 {
	public int num1;
	public int num2;

	public Caaa4(int a, int b) {
		num1 = a;
		num2 = b;
	}
}

class Cbbb4 extends Caaa4 {
	public Cbbb4(int a, int b) {
		super(a, b);
	}

	public void show() {
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}
}

public class Class14 {
	public static void main(String args[]) {
		Cbbb4 b2 = new Cbbb4(3, 9);
		b2.show();
	}
}