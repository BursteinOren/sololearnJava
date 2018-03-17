
public class myClassChapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = sum(2,5);
		System.out.println(x);
		
		
		System.out.println("----------------------");
		Animal dog = new Animal();
		dog.bark();
		
		System.out.println("----------------------");
		Vehicle v = new Vehicle();
		v.setColor("blue");
		v.horn();
		System.out.println(v.getColor());
		
		
		
	}

	static int sum(int val1,int val2) {
		return val1 +val2;
	}
}
