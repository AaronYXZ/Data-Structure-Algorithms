/* You will need to call the quicksort function 3 times on 3 separate data sets.  Each time, first print out the array, then sort, then print out again.

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



public class QuickSort {
	public static void sort(int arr[], int l, int r)
	{
		int m = (r+l)/2;
		int pivot = arr[m];

		int i = l, j = r;

		while (i <=j)
		{
			while (arr[i] < pivot)
			{
				i++;
			}
			while (arr[j] > pivot)
			{
				j--;
			}
			if (i <=j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if ( j > l)
		{
			sort(arr, l, j);
		}

		if ( i<r)
		{
			sort(arr, i, r);
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
		printArray(arr1);
		QuickSort qs = new QuickSort();
		int l = 0, r = arr1.length-1;
		qs.sort(arr1, l, r);
		printArray(arr1);
		System.out.println();

		printArray(arr2);
		r = arr2.length-1;
		qs.sort(arr2, l, r);
		printArray(arr2);
		System.out.println();
		
		printArray(arr3);
		r = arr3.length-1;
		qs.sort(arr3, l, r);
		printArray(arr3);
	} 
}












