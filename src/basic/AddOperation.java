package basic;

public class AddOperation {
	
	public void add(int a, int b) {
		System.out.println("Sum of two numbers is " + (a+b));
	}
	

	public static void main(String[] args) {
		AddOperation obj = new AddOperation();
		obj.add(25, 25);

	}

}
