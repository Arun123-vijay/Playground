import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String b = String.valueOf(a);
      String c = b.substring(0,1);
      String d = b.substring(b.length()-1);
      int f = Integer.parseInt(c);
      int k = Integer.parseInt(d);
      int j = f+k;
      System.out.println(j);
	}
}