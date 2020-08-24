public class NumberToWord {
    public static void main(String[] args){
        numberToWords(101010);
    }

    public static void numberToWords(int number){
        if(number < 0) System.out.println("Invalid Value");
        int reversed = reverse(number);
        int zeroCount = getDigitCount(number) - getDigitCount(reversed);

        if(reversed == 0) System.out.println("Zero");

        while(reversed != 0){
            int lastDigit = reversed % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
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
            }

            reversed /= 10;
        }

        for (int i = 0; i < zeroCount; i++) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount(int number){
        if(number < 0) return -1;

        int digits;

        if(number == 0){
            digits = 1;
            return digits;
        }

        for (digits = 0; number > 0; number = number/10) {
            digits = digits + 1;
        }

        return digits;
    }

    public static int reverse(int number){
        int reversed = 0;

        while(number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }
}
