public class MegabytesConverter {

  public static void main(String[] args) {
    printMegabytesAndKilobytes(5000);
  }

  public static void printMegabytesAndKilobytes(int kilobytes) {
    int megabytes;
    int remainingKilobytes;

    if(kilobytes < 0) {
      System.out.println("Invalid Value");
    } else {
      megabytes = kilobytes / 1024;
      remainingKilobytes = kilobytes % 1024;
      System.out.println(kilobytes + " KB = " +
                         megabytes + " MB and " +
                         remainingKilobytes + " KB");
    }
  }
}
