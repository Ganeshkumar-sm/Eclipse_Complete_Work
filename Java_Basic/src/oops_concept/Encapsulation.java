package oops_concept;

public class Encapsulation {
	private String name;
	private int age;
	private int rollno;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Ganesh");
		obj.setAge(26);
		obj.setRollno(1123);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getRollno());
		
	}

}
