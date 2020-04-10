public class SpeedConverter {

  public static void main(String[] args){
    printConversion(10);
  }

  public static long toMilesPerHour(double kmph) {

    long conversion;

    if(kmph < 0) {
      return -1;
    } else {
      conversion = Math.round(kmph / 1.609);
    }
    return conversion;
  }

  public static void printConversion(double kmph) {
    long mph = toMilesPerHour(kmph);
    if(mph == -1) {
      System.out.println("Invalid Value");
    } else {
      System.out.println(kmph + " km/h = " + mph + " mi/h" );
    }
  }
}
