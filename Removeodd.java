import java.util.*;
public class Removeodd {
	public int[] removeodds(int arr[]) {
		int countodd = 0;
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			if(arr[i]%2!=0)
				countodd++;
		}
		int j =0;
		int arr_odd[] = new int[countodd];
		for(int i = 0;i<n;i++) {
			if(arr[i]%2!=0) {
				arr_odd[j] = arr[i];
				j++;
			}
		}
		return arr_odd;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			}
		Removeodd r = new Removeodd();
		int result[] = r.removeodds(arr);
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
