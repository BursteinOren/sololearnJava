
public class myClassChapter3 {
	public static void main(String[ ] args) {
	    Person j = new Person("John");
	    j.setAge(20);
	    celebrateBirthday(j);
	    j.setName("Tom");
	    System.out.println(j.getName());
	    System.out.println(j.getAge());
	    
	  }
	  static void celebrateBirthday(Person p) {
	    p.setAge(p.getAge() + 1);
	  }
}
