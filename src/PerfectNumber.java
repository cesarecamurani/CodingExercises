public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(5));
		System.out.println(isPerfectNumber(-1));
	}

	public static boolean isPerfectNumber(int number) {
		if(number < 1) return false;

		int ppd = 0;
		int ppdSum = 0;

		while(ppdSum < number) {
			ppd++;
			if(number % ppd == 0) ppdSum += ppd;
		}
		return(ppdSum == number);
	}
}
