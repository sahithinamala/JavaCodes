import java.util.*;
public class ReverseArray {
	public int[] reverse_array(int arr[]) {
		int n = arr.length;
		int temp = 0;
		int start = 0;
		int end = n-1;
		for(int i = 0;i<n;i++) {
			if(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			}
		}
		return arr;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			}
		ReverseArray ra = new ReverseArray();
		int arr1[] = ra.reverse_array(arr);
		for(int i = 0;i<n;i++) {
			System.out.println(arr1[i]);
		}
	}

}
