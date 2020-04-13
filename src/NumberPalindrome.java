public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(3778));
		System.out.println(isPalindrome(3773));
		System.out.println(isPalindrome(-3773));
		System.out.println(isPalindrome(478));
	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int numberToCompare = number;
		while(number != 0) {
			int lastDigit = number % 10;
			reverse *= 10;
			reverse += lastDigit;
			number /= 10;
		}
		return reverse == numberToCompare;
	}
}
