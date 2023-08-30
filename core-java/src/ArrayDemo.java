
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5};
		
		int[][] max = {{1,2,3},{4,5,6}};
		
		for(int i=0; i< ar.length; i++) {
			//System.out.println(ar[i]);
		}
		for (int i : ar) {
			System.out.print(i);
			}
		
		for(int i=0; i<max.length; i++) {
			for (int j = 0; j < max[i].length; j++) {
				System.out.printf(max[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] jag = {{1,2},{1,2,3},{1,2,3,4}};
		
		for (int i = 0; i < jag.length; i++) {
			for(int j = 0; j < jag[i].length; j++) {
			System.out.print(jag[i][j] + "\t");
		}
		System.out.println();
		}

}
}