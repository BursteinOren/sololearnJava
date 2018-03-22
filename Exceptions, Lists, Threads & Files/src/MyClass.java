import java.io.IOException;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int a[ ] = new int[2];
		      System.out.println(a[1]);
		    } catch (Exception e) {
		      System.out.println("An error occurred");
		      System.out.println("Message: "+e.getMessage());
		      System.out.println("Cause: "+e.getCause().toString());
		//      System.out.println("Message: "+e.getMessage());

		    }
		System.out.println("div:" + div(4,3));
		//System.out.println("div:" + div(4,0));
		
	}
	public static int div(int a, int b) throws ArithmeticException,IOException{
		  if(b == 0) {
		    throw new ArithmeticException("Division by Zero");
		  } else {
		    return a / b;
		  }
		  
		}
}
