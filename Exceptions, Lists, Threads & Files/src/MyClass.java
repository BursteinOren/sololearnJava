
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int a[ ] = new int[2];
		      System.out.println(a[5]);
		    } catch (Exception e) {
		      System.out.println("An error occurred");
		      System.out.println("Message: "+e.getMessage());
		      System.out.println("Cause: "+e.getCause().toString());
		//      System.out.println("Message: "+e.getMessage());

		    
		    }
		
	}

}
