import java.util.Iterator;

public class MergeSort{
	public static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		if(inputLength < 2) {
			return;
		}
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		for(int i=0; i<midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		
		for(int i=midIndex; i<inputLength; i++) {
			rightHalf[i-midIndex] = inputArray[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
	}
	
	private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i =0,j=0, k =0;
		while(i<leftSize && j < rightSize) {
			if(leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			}
			else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		while(i<leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j < rightSize) {
			inputArray[k] = leftHalf[j];
			j++;
			k++;
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,7,8,4,34,56,12,1,};
		MergeSort s = new MergeSort();
		printArray(arr);
		
		mergeSort(arr);
		
		System.out.println();
		printArray(arr);
	}
}