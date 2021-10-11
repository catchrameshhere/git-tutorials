package basic;

public class SubstractionOperation {
	
	public void subs(int a, int b) {
		System.out.println("Result of substraction = " + (a-b));
	}
	

	public static void main(String[] args) {
		SubstractionOperation obj = new SubstractionOperation();
		obj.subs(100, 25);

	}

}
