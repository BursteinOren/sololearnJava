/**
 * class description for testing javadocs purpose
 * 
 * @author orenb
 *
 */
public class Arrays {
	/**
	 * main method description.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		System.out.println("________________");

		/**
		 * create array sample
		 */
		int[ ][ ] myArr = { {1, 2, 3}, {4}, {5, 6, 7} };
		myArr[0][2] = 42;
		int x = myArr[1][0]; // 4
		
		for (int i=0; i< myArr.length;i++) {
			for (int j=0; j<myArr[i].length;j++) {
				if (j>0) {
					System.out.print("   -   ");
				}
				System.out.print(myArr[i][j]);
			}
			System.out.println();
		}
	
	}

}
