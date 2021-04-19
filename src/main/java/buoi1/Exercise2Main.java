package buoi1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise2Main {
	public static void main(String[] args) {
		//System.out.println(isPrime(2));
		getPythagoras();
		//manipulateArray(new int[] {6, 3, 1, 5, 9, 1, 2, 1, -6});
//		manipulate2ndArray(new int[][] {{9, 22, 7, 33}, 
//										{4, 1, 2, 8},
//										{14, 3, 69, 25}});
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}	
	}
	
	public static void getPythagoras() {
		System.out.print("x" + "\t");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
	
	public static void manipulateArray(int[] integers) {
		System.out.println("Elements of Array:" + Arrays.toString(integers));
		int min = Arrays.stream(integers).min().getAsInt();
		System.out.println("Min value of array: " + min);
		int max = Arrays.stream(integers).max().getAsInt();
		System.out.println("Max value of array: " + max);
		int num = 1;
		int[] indicies = IntStream.range(0, integers.length).filter(i -> integers[i] == num).toArray();
		System.out.println(num + " found at index = " + Arrays.toString(indicies));
		long count = IntStream.range(0, integers.length).filter(i -> integers[i] == num).count();
		System.out.println("Occurrences of " + num + ": " + count);
		Arrays.sort(integers);
		System.out.println("Array after sorting: " + Arrays.toString(integers));
	}
	
	public static void manipulate2ndArray(int[][] integers) {
		//System.out.println("Elements of 2dArray: " + Arrays.deepToString(integers));
		System.out.println("Elements of 2dArray: ");
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[0].length; j++) {
				System.out.print(integers[i][j] + "\t");
			}
			System.out.println();
		}
		
		int min = integers[0][0];
		int max = integers[0][0];
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[0].length; j++) {
				if (max < integers[i][j]) {
					max = integers[i][j];
				} 
				if (min > integers[i][j]) {
					min = integers[i][j];
				}
			}
		}
		System.out.println("Max value of 2dArray: " + max);
		System.out.println("Min value of 2dArray: " + min);
		
		/*for (int i = 0; i < integers.length; i++) {
			Arrays.sort(integers[i]);
		}
		System.out.println("2dArray after sorting by rowwise: ");
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[0].length; j++) {
				System.out.print(integers[i][j] + "\t");
			}
			System.out.println();
		}*/
		
		for (int i = 0; i < integers.length; i++) {
			for (int j = i + 1; j < integers.length; j++) {
				if (integers[i][i] > integers[j][j]) {
					int temp = integers[i][i];
					integers[i][i] = integers[j][j];
					integers[j][j] = temp;
				}
			}
		}
		System.out.println("2dArray after sorting by main diagonal: ");
		for (int i = 0; i < integers.length; i++) {
			for (int j = 0; j < integers[0].length; j++) {
				System.out.print(integers[i][j] + "\t");
			}
			System.out.println();
		}
	}	
}
