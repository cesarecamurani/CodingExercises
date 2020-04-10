public class EqualSumChecker {

  public static void main(String[] args) {
    System.out.println(hasEqualSum(2, 5, 7));
    System.out.println(hasEqualSum(3, 5, 7));
    System.out.println(hasEqualSum(2, 10, 11));
    System.out.println(hasEqualSum(4, -5, -1));
  }

  public static boolean hasEqualSum(int n1, int n2, int n3) {
    return n1 + n2 == n3;
  }
}
