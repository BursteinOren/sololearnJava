package samples;

public class Person {
	private int age;
	private String name;
	public void setAge(int age){
		if (age > 0) {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name){
		if (name != null) {
	 		this.name = name;
		}
	}
	public String getName() {
		return this.name;
	}
	Person(){
		this.setName("Danni");
	}
	Person(String name){
		if (name != null) {
			this.setName(name);
		}
	}
	
}
