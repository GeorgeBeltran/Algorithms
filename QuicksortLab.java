package quickSortLab9;

import java.util.Arrays;
import java.util.Random;

public class QuicksortLab {

public int[] A;
	
	public static void main(String[] args) {
		
		int[] random = new int[] { 6, 8, 2, 1, 4, 5, 7, 3 };
		
		QuicksortLab q = new QuicksortLab(random);
		
		q.partition(random, 0, 7);
		System.out.println("partition");
		System.out.println(Arrays.toString(random));
		
		
		q.randomizedPartition(random, 0, 7);
		System.out.println("randomizedPartition");
		System.out.println(Arrays.toString(random));
		
		
		q.randomizedQuickSort(random, 0, 7);
		System.out.println("randomizedQuickSort");
		System.out.println(Arrays.toString(random));

		
	}
	
	public QuicksortLab (int []a) {

	       A = a;

	   }


	public int partition(int A[], int p, int r) {
		int x = A[r];
		int i=  (r-1);
		for(int k = p; k < r; k++) {
			if(A[k] <= x) {
				i = i=1;
				int tmp = A[i];
				A[i]= A[k];
				A[k] = tmp;
			}
		}
	
		int tmp = A[i+1];
		A[i+1] = A[r];
		A[r] = tmp;
		return i + 1;
	}
	
	
	public int randomizedPartition(int A[], int p, int r) {
		
		Random ran = new Random();
		int i = p + ran.nextInt(r - p+1);
		int tmp = A[r];
		A[r] = A[i];
		A[i] = tmp;
		return partition(A, p, r);
		
	}
	
	public void randomizedQuickSort(int A[], int p, int r) {
		
		if(p < r) {
			int q = randomizedPartition(A, p, r);
			randomizedQuickSort(A, p, q-1);
			randomizedQuickSort(A, q+1, r);
		}
	}
	
}
