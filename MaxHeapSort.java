package heapSortLab8;

import java.util.Arrays;

public class MaxHeapSort {

	public static void main(String[] args) {
		
		int[] random = new int[] { 4, 7, 1, 3, 0, 8, 6 };

		MaxHeapSort m = new MaxHeapSort(random);
		
		m.HeapSort(random);
		System.out.println("Sort  4, 7, 1, 3, 0, 8, 6 ");
		System.out.println(Arrays.toString(random));
	   
		
		
		
		
		int[] minToMax = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		MaxHeapSort k = new MaxHeapSort(minToMax);
		
		k.HeapSort(minToMax);
		System.out.println("------------------------------");
		System.out.println("Sort  1, 2, 3, 4, 5, 6, 7");
		System.out.println(Arrays.toString(minToMax));
	   
		
		
		
		int[] MaxToMin = new int[] { 7, 6, 5, 4, 3, 2, 1 };

		MaxHeapSort j = new MaxHeapSort(MaxToMin);
		
		j.HeapSort(MaxToMin);
		System.out.println("------------------------------");
		System.out.println("Sort  7, 6, 5, 4, 3, 2, 1");
		System.out.println(Arrays.toString(MaxToMin));
	   
		
		}
		
	public MaxHeapSort(int []a) {

		A = a;

	}

	static void swap(int[] A, int x, int y) {

    	int temp = A[x - 1]; 

    	A[x - 1] = A[y - 1]; 

    	A[y - 1] = temp; 

    
	}
	public void MaxHeapify(int[] A, int i, int heapSize) {
	
		int left = 2*i;
		int right =(2*i)+1;
		int largestNum;
	
		if(left <= heapSize && A[left -1 ] > A[i-1]) { //maybe left - 1 and i - 1
			largestNum = left;
		}
		else {
			largestNum = i;
		}
	
		if(right <= heapSize && A[right -1] > A[largestNum-1]) {
			largestNum = right;
		}
		if(largestNum != i) {
			swap(A, i, largestNum);
			MaxHeapify(A, largestNum, heapSize);
		}
	
	}

	public void BuildMaxHeapify(int[] A) {
	 
		for(int i = A.length/2; i >= 1; i--) {
		 	MaxHeapify(A, i, A.length);
	 	}
	 
 	}

	public void HeapSort(int[] A) {
	
	BuildMaxHeapify(A);
	int heapSize = A.length;
	
	for(int i = A.length; i >= 2; i--) {
		swap(A, 1, i);
		heapSize--;
		MaxHeapify(A, 1, heapSize);
		}
	}

}
