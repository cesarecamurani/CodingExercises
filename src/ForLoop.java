public class ForLoop {
	public static void main(String[] args){

		double[] rates = { 2, 3, 4, 5, 6, 7, 8 };

		for(double rate : rates){
			int rateInt = (int) rate;
			System.out.println("$10,000 at " +
				rateInt + "% interest = " +
				calculateInterest(10000.0, rate)
			);
		}
	}

	public static double calculateInterest(double amount, double interestRate){
		return (amount * (interestRate / 100));
	}
}
