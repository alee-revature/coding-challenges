/*
 * 1) Find the Contiguous Subarray with Sum to a Given Value in an array.

For example :
arr[]={14, 12, 70, 15, 99, 65, 21, 90};
X =97.
Sum found between index 1 to 3
Elements are 12, 70 and 15
 */
public class ContiguousSubarraySum {
public static void main (String[] args) {
	int arr[] = {14, 12, 70, 15, 99, 65, 21, 90};
	findSum(arr, 97);
}

public static void findSum (int[] array, int x) {
int sum = 0;
int currentIndex = 0;
//find sum of array	
//if the sum of the array is equal to the value x, stop
	do {
		for(int value: array) {
			
			sum += value;
			currentIndex++;
			if (sum == x) {
				System.out.println(" Sum is: " + sum);
				System.out.println(" Sum found between index: " + currentIndex);
			}
			System.out.println("Sum of elements so far is: " + sum);
		}
	} while (sum < x);

}
}