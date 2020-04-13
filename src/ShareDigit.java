public class ShareDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(33, 23));
	}

	public static boolean hasSharedDigit(int x, int y) {
		if((x < 10 || x > 99) || (y < 10 || y > 99)) {
			return false;
		}

		int xLast = x % 10;
		int xFirst = x / 10;

		int yLast = y % 10;
		int yFirst = y / 10;

		return(xFirst == yFirst || xLast == yLast || xFirst == yLast || yFirst == xLast);
	}
}
