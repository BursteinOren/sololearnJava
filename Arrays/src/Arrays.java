/**
 * class description for testing javadocs purpose
 * @author orenb
 *
 */
public class Arrays {
/**
 * main method description.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		System.out.println("________________");
		
		/**
		 * create array sample
		 */
		int[] arr = new int[5];
		arr[2]=42;
		for (int i=0;i<5;i++) {
			System.out.println("The value of cell "+i+" is "+arr[i]);
		}
		
	}

}
