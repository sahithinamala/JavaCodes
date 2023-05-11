import java.util.*;
public class FindMin {
	public int min(int arr[]) {
		int n = arr.length;
		int min = arr[0];
		for(int i = 1;i<n;i++) {
			if(min>arr[i])
				min = arr[i];
		}
		return min;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			}
		FindMin fn = new FindMin();
		int num = fn.min(arr);
		System.out.println(num);
	}
}
