
public class SortingDemo {
	
	public int[] bubble(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j+1] < arr[j] ) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public int[] selection(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++ ) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		return arr;
	}
	
	public int[] merge(int[] arr) {
		
		
		return arr;
	}
	
	public static void print(int[] arr) {
		int i=0;
		while( i <arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}

	public static void main(String[] args) {
		int[] arr  = {1,4,7,56,34,456,34,23,67,78,89,};
		print(arr);
		System.out.println();
		SortingDemo s = new SortingDemo();
//		s.bubble(arr);
//		print(arr);
		
		s.selection(arr);
		print(arr);

	}

}
