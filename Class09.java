class Caaa2 {
	private int num;

	public void display() {
		System.out.println("printed from Caaa2 class");
	}
}

class Cbbb2 extends Caaa2 {
	public void display() {
		System.out.println("printed from Cbbb2 class");
	}
}

public class Class09 {
	public static void main(String args[]) {
		Caaa2 bb = new Cbbb2();
		bb.display();
	}
}