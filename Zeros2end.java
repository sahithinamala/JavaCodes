import java.util.Scanner;

public class Zeros2end {
	public int[] zeros(int arr[]) {
		int n = arr.length;
		int j = 0;
		int temp = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0)
				j++;
			
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
		Zeros2end r = new Zeros2end();
		int result[] = r.zeros(arr);
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
