package practice;

public class MutableImmutable {
	String name;
	 MutableImmutable(String name) {
		
		this.name = name;
	}
	 
	 public String setName() {
		
		return name;
	}
	 
	 public String getName() {
		 
		 System.out.println("Name of The Class: "+name);
		return name;
		
	}
	 

	public static void main(String[] args) {
		MutableImmutable mm = new MutableImmutable("Ganesh");
		mm.setName();
		mm.getName();
		//System.out.println();
		
	}

}
