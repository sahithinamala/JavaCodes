import java.util.Scanner;

public class SecondMax {
	public int secondmaximum(int arr[]) {
		int n = arr.length;
		int max = arr[0];
		int second_max = arr[0];
		for(int i = 1;i<n;i++) {
			if(max<=arr[i])
				max = arr[i];
		}
		
		for(int i = 0;i<n;i++) {
			if(arr[i] == max)
				arr[i] = arr[0];
		}
		for(int i = 1;i<n;i++) {
			if(second_max<=arr[i])
				second_max = arr[i];
		}
		
		return second_max;
		
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			}
		SecondMax sm = new SecondMax();
		System.out.println(sm.secondmaximum(arr));
	}

}
