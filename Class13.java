class Caaa3 {
	public int num1;
	public int num2;

	public Caaa3() {
		num1 = 1;
		num2 = 1;
	}
}

class Cbbb3 extends Caaa3 {
	public Cbbb3() {
		super();
	}

	public void show() {
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}
}

public class Class13 {
	public static void main(String args[]) {
		Cbbb3 b1 = new Cbbb3();
		b1.show();
	}
}