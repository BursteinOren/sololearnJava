import java.awt.*;

class MyClass {
	public static void main(String[ ] args) {
    Animal a1 = new Animal("Robby");
    Animal a2 = new Animal("Robby");
    System.out.println(a1.hashCode());
    System.out.println(a1.name.hashCode());
    System.out.println(a1.getClass());
    System.out.println("----------------");
    System.out.println(a1 == a2);
    System.out.println("----------------");
    System.out.println(a1.equals(a2));
	}
}
//Outputs false
