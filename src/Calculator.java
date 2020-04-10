public class Calculator {
  public static void main(String[] args) {
    double centimeters = calcFeetAndInchesToCentimeters(100);
    System.out.println(centimeters);
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    double valueInCentimeters;
    double totalInches;

    if(feet <= 0 || inches < 0 || inches > 12)
      valueInCentimeters = -1;
    else {
      totalInches  = (feet * 12) + inches;
      valueInCentimeters = totalInches * 2.54;
    }
    return valueInCentimeters;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if(inches <= 0) return -1;

    double feet = (int) inches / 12;
    double remainingInches = (int) inches % 12;
    return calcFeetAndInchesToCentimeters(feet, remainingInches);
  }
}
