public class ThreeAndFiveSum {
	public static void main(String[] args){
		int counter = 0;
		int sum = 0;

		for(int i = 1; i <= 1000; i++){
			if((i % 3 == 0) && (i % 5 == 0)){
				counter++;
				System.out.println(i);
				sum += i;
			}
			if(counter == 5) break;
		}
		System.out.println("==============");
		System.out.println(sum);
	}
}
