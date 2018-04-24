package eu.oloeriu.app;

public class BinarySearch {
	public int binarySearchInteractively(int[] sortedArray, int key, int low, int high) {
		
		int index = Integer.MAX_VALUE;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (sortedArray[mid] < key ) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid -1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}
		}
		
		return index;
	}
	
	public int binarySearchRecursively(int[] sortedArray, int key, int low, int high) {
		
		
		if (high < low) {
			return -1;
		}
		
		int middle = (low + high) / 2;
		if (key == sortedArray[middle]) {
			return middle;
		}else if (key < sortedArray[middle]) {
			return binarySearchRecursively(sortedArray, key, low, middle-1);
		}else {
			return binarySearchRecursively(sortedArray, key, middle + 1, high);
		}
	}
}
