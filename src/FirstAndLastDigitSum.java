public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(5));
	}

	public static int sumFirstAndLastDigit(int number) {
		if(number < 0 ) return -1;
		int reverse = 0;
		int sum;
		int lastDigit = number % 10;
		int firstDigit = 0;

		while(number != 0) {
			int provLastDigit = number % 10;
			reverse *= 10;
			reverse += provLastDigit;
			number /= 10;
			firstDigit = reverse % 10;
		}
		sum = firstDigit + lastDigit;
		return sum;
	}
}
