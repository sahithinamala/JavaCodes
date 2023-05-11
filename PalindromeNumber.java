
public class PalindromeNumber {
	public static void main(String[]args) {
		int sum=0;
		int r = 0;
		int n = 545;
		int temp = n;
		while(n>0) {
			r = n%10;
			sum = sum*10 + r;
			n = n/10;
		}
		if(sum == temp )
			System.out.println("Is Pal");
		else
			System.out.println("Not Pal");
	}

}
