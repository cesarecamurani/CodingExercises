import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

  public static void main(String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces(99.67, 99.6789));
  }

  public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

    BigDecimal bg1 = new BigDecimal(number1);
    BigDecimal bg2 = new BigDecimal(number2);

    double truncated1;
    double truncated2;

    if(BigDecimal.valueOf(number1).scale() <= 3) {
      truncated1 = number1;
    } else {
      truncated1 = bg1.setScale(3, RoundingMode.DOWN).doubleValue();
    }

    if(BigDecimal.valueOf(number2).scale() <= 3) {
      truncated2 = number2;
    } else {
      truncated2 = bg2.setScale(3, RoundingMode.DOWN).doubleValue();
    }

    System.out.println(truncated1 + "\n" + truncated2);

    return truncated1 == truncated2;

  }
}
