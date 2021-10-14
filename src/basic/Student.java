package basic;

public class Student {
	
	String name;
	
	public void helpDesk() {
		System.out.println("How may I help you?");
	}
	
	public void welcomeMessage() {
		System.out.println("Welcome "+name+", to the college");
	}
	
	public void test() {
		System.out.println("from test method");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "Gabby";
		obj.welcomeMessage();

	}

}
