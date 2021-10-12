package basic;

public class Student {
	
	String name;
	
	public void welcomeMessage() {
		System.out.println("Welcome "+name+", to the college");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "Gabby";
		obj.welcomeMessage();

	}

}
