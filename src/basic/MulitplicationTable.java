package basic;

public class MulitplicationTable {
	
	
	public void mulitply(int num, int limit) {
		for(int i=1; i<=limit; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	

	public static void main(String[] args) {
		MulitplicationTable obj = new MulitplicationTable();
		obj.mulitply(2, 10);

	}

}
