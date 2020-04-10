public class TeenNumberChecker {
  public static void main(String[] args) {
    System.out.println(isTeen(13));
    System.out.println(hasTeen(0, 14, 1));
  }

  public static boolean hasTeen(int n1, int n2, int n3) {
    return (n1 >= 13) && (n1 <= 19) ||
           (n2 >= 13) && (n2 <= 19) ||
           (n3 >= 13) && (n3 <= 19);
   }

  public static boolean isTeen(int n) {
    return (n >= 13) && (n <= 19);
  }
}
