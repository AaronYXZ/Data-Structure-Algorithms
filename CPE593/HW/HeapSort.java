/*
Copy the quicksort homework and replace the quicksort function by heapsort.

Test on the same data as the quicksort assignment.

data sets are:

1 2 3 4 5 6 7 8 9 10

10 9 8 7 6 5 4 3 2 1

62 50 50 50 62


The correct output should be:
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10

10 9 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 10

62 50 50 50 62
50 50 50 62 62


*/

package hw1;

public class HeapSort {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = n/2-1; i>=0; i--)
		{
			heapify(arr, n, i);
		}

		for (int i = n-1; i>=0; i--)
		{	int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int n, int i)
	{
		int l = 2*i + 1;
		int r = 2*i + 2;
		int largest = i;
		if (l < n && arr[l] > arr[largest])
		{
			largest = l;
		}
		if (r < n && arr[r] > arr[largest])
		{
			largest = r;
		}

		if (largest != i)
		{
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, n, largest);
		}
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr2[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int arr3[] = {62, 50, 50, 50, 62};	

		HeapSort hs = new HeapSort();
		
		printArray(arr1);
		hs.sort(arr1);
		printArray(arr1);
		System.out.println();
		
		printArray(arr2);
		hs.sort(arr2);
		printArray(arr2);
		System.out.println();
		
		printArray(arr3);
		hs.sort(arr3);
		printArray(arr3);
	} 
}












