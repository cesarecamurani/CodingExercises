public class DigitSum {
	public static void main(String[] args) {
		int number = 696969;
		System.out.println(
			"Sum of digits in " +
			number + " is " +
			sumDigits(number)
		);
	}

	private static int sumDigits(int number) {
		if(number < 10) return -1;

		int sum = 0;

		while(number > 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		return sum;
	}
}
