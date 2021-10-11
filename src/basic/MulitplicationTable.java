package basic;

public class MulitplicationTable {
	
	
	public void mulitply(int num, int limit) {
		for(int i=1; i<=limit; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	
	public void add(int a, int b) {
		System.out.println("Sum of two numbers is " + (a+b));
	}
	

	public static void main(String[] args) {
		MulitplicationTable obj = new MulitplicationTable();
		obj.mulitply(2, 10);
		obj.add(25, 25);

	}

}
