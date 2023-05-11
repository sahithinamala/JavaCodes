import java.util.*;
public class StringPalindrome {
	public boolean isPalindrome(char arr[]) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while(start<end) {
			if(arr[start]!=arr[end])
				return false;
			
				start++;
				end--;
			
				
		}
		
		return true;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		
		StringPalindrome sp = new StringPalindrome();
		boolean pal = sp.isPalindrome(arr);
		System.out.println(pal);
	}

}
