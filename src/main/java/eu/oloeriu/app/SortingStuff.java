package eu.oloeriu.app;

public class SortingStuff {
	public void bubbleSort(Integer[] arr) {
		int n = arr.length;
		for (int i=1;i< n;i++) {
			if (arr[i-1] > arr[i]) {
				//swap elements
				int temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
