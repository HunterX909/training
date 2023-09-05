//import java.util.Arrays;
import java.io.*;

public class ArraySorting {
	public static void main(String[] args) throws Exception{
		try {			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input= br.readLine().split(" ");
		int[] ar = new int[input.length];
		for(int z=0; z< input.length; z++) {
			ar[z] = Integer.parseInt(input[z]);
		}
		
		//int[] ar = {5, 3 , 4 , 6, 2, 5, 89, 45, 67, 200, 0, 99, 45, 56, 67};
		for ( int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println("---Sorted array with Java API");
		//Arrays.sort(ar);
		
		//Sorting Logic
		System.out.println("---Bobble Sort");
		long start = System.currentTimeMillis();
		int temp =0;
		for(int k=0; k<ar.length; k++) {
			for(int l=0; l<ar.length-k-1; l++) {
				if(ar[l]> ar[l+1]) {
					temp = ar[l];
					ar[l] = ar[l+1];
					ar[l+1] = temp;
				}
			}
		}	
		
		long end = System.currentTimeMillis();
		for (int j : ar) {
			System.out.print(j + " ");
		}	
		System.out.println("Time Taken " + (end-start) + "ms");
		
		System.out.println("---Selection Sort");
		for(int a = 0; a<ar.length-1; a++) {
			int min =a;
			for(int b = a+1; b<ar.length-1; b++) {
				if(ar[b]< ar[min])
				ar[min] =ar[b];
			}
			int temp1 = ar[min];
			ar[min] = ar[a];
			ar[a] = temp1;
		}
		
		for (int c : ar) {
			System.out.print(c + " ");
		}
	} catch (IOException e) {
		System.out.println("Error in Input" + e.getMessage());
	} catch (NumberFormatException e) {
        System.err.println("Invalid input format. Please enter valid integers: " + e.getMessage());
    }
	}
}
