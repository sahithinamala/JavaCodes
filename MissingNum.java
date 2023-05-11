import java.util.Scanner;

public class MissingNum {
	public int missnum(int arr[]) {
		int n = arr.length;
		int a = n+1;
		int arr_sum = 0;
		for(int i = 0;i<n;i++) {
			arr_sum = arr_sum + arr[i];
		}
		int total_sum = a*(a+1)/2;
		int num = total_sum - arr_sum;
		return num;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			}
		MissingNum mn = new MissingNum();
		int num = mn.missnum(arr);
		System.out.println(num);
	}
}
