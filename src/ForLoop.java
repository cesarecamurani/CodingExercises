public class ForLoop {
	public static void main(String[] args){

		double[] rates = { 2, 3, 4, 5, 6, 7, 8 };
		int[] numbers = { 3, 5, 13, 22, 31, 55, 66, 78, 87, 96 };

		int count = 0;
		int counter = 0;

		for(int num : numbers){
			if(isPrime(num)){
				count++;
				System.out.println(num);
			}
			if(count == 3) break;
		}

		System.out.println("\n******************\n");

		for(int num = 10; num < 50; num++){
			if(isPrime(num)){
				counter++;
				System.out.println(num);
			}
			if(counter == 3) break;
		}

		System.out.println("\n******************\n");

		for(double rate : rates){
			int rateInt = (int) rate;
			System.out.println("$10,000 at " +
				rateInt + "% interest = " +
				String.format("%.2f", calculateInterest(10000.0, rate))
			);
		}
	}

	public static double calculateInterest(double amount, double interestRate){
		return (amount * (interestRate / 100));
	}

	public static boolean isPrime(int n){
		if(n == 1) return false;
		for(int i = 2; i <= n/2; i++) if(n%i == 0) return false;
		return true;
	}
}
