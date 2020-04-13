public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
	}

	public static boolean hasSameLastDigit(int x, int y, int z) {
		if(!isValid(x) || !isValid(y) || !isValid(z)) return false;

		int xLD = x % 10; int yLD = y % 10; int zLD = z % 10;

		return(xLD == yLD || xLD == zLD || yLD == zLD);
	}

	public static boolean isValid(int number) {
		return(number >= 10 && number <= 1000);
	}
}
