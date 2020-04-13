public class WhileLoop {

	public static void main(String[] args) {

		int number = 2;
		int lastNumber = 20;
		int count = 0;

		while(number <= lastNumber) {
			number++;
			if (!isEvenNumber(number)) continue;

			count++;

			System.out.println("Even Number " + number);

			if (count >= 5) break;
		}

		System.out.println("The sum of all even numbers is " + count);
	}

	public static boolean isEvenNumber(int number) {
		return (number % 2 == 0);
	}
}
