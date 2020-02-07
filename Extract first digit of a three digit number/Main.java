import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String b = String.valueOf(a);
      String c = b.substring(0,1);
      int k = Integer.parseInt(c);
      System.out.println(k);
	}
}