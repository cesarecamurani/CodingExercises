public class NumbersToWords {

	public static void main(String[] args) {
		numberToWords(1270);
	}

	public static void numberToWords(int number) {
		if(number < 0) System.out.println("Invalid Value");

		while(number != 0) {
			int lastDigit = number % 10;
			number /= 10;
			printWord(lastDigit);
		}
	}

	public static void printWord(int number) {
		switch(number){
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Zero");
				break;
		}
	}
}
