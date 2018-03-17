
public class myClassChapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = sum(2,5);
		System.out.println(x);
		
		
		System.out.println("----------------------");
		Animal dog = new Animal();
		dog.bark();
		
		System.out.println("----------------------");
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Green");
		//v.setColor("Blue");
		v1.horn();
		System.out.println(v1.getColor());
		System.out.println(v2.getColor());
		
		
		
	}

	static int sum(int val1,int val2) {
		return val1 +val2;
	}
}
