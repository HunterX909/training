
public class StatisticsQuiz {
	public static void main(String[] args) {
		int[] ar = {3, 8, 2, 4, 5, 9, 7};
		
		System.out.println("Sum: " + sum(ar));
		System.out.println("Sum: " + max(ar));
		System.out.println("Sum: " + min(ar));
		System.out.println("Sum: " + avg(ar));
	}

	private static double avg(int[] ar) {
		double sum =0;
		double n = ar.length;
		for (double i : ar) {
			sum += i;
		}
		return sum/n;
	}

	private static int min(int[] ar) {
		int min =ar[0];
		for (int i : ar) {
			if(i<min)
				min=i;
		}
		return min;
	}

	private static int max(int[] ar) {
		int max =0;
		for (int i : ar) {
			if(i>max)
				max=i;
		}
		return max;
	}

	private static int sum(int[] ar) {
		int total =0;
		for (int i : ar) {
			total += i;
		}
		return total;
	}
}
