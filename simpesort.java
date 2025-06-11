package practice;

public class simpesort {


		    // Function to merge two halves
		    void merge(int arr[], int left, int mid, int right) {
		        int n1 = mid - left + 1;
		        int n2 = right - mid;

		        int L[] = new int[n1];
		        int R[] = new int[n2];

		        // Copy data to temp arrays
		        for (int i = 0; i < n1; ++i)
		            L[i] = arr[left + i];
		        for (int j = 0; j < n2; ++j)
		            R[j] = arr[mid + 1 + j];

		        // Merge the temp arrays
		        int i = 0, j = 0;
		        int k = left;

		        while (i < n1 && j < n2) {
		            if (L[i] <= R[j]) {
		                arr[k] = L[i];
		                i++;
		            } else {
		                arr[k] = R[j];
		                j++;
		            }
		            k++;
		        }

		        // Copy remaining elements
		        while (i < n1) {
		            arr[k] = L[i];
		            i++;
		            k++;
		        }
		        while (j < n2) {
		            arr[k] = R[j];
		            j++;
		            k++;
		        }
		    }

		    // Main sort function
		    void sort(int arr[], int left, int right) {
		        if (left < right) {
		            int mid = left + (right - left) / 2;

		            sort(arr, left, mid);
		            sort(arr, mid + 1, right);

		            merge(arr, left, mid, right);
		        }
		    }

		    // Utility function to print array
		    static void printArray(int arr[]) {
		        for (int value : arr)
		            System.out.print(value + " ");
		        System.out.println();
		    }

		    // Main method
		    public static void main(String args[]) {
		        int arr[] = { 12, 11, 13, 5, 6, 7 };

		        System.out.println("Original Array:");
		        printArray(arr);

		        simpesort ob = new simpesort();
		        ob.sort(arr, 0, arr.length - 1);

		        System.out.println("Sorted Array:");
		        printArray(arr);
		    }
		}




