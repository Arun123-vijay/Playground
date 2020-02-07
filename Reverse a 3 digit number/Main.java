import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b = String.valueOf(a);
    StringBuffer c = new StringBuffer(b);
    c.reverse();
    String j = c.toString();
    int k = Integer.parseInt(j);
    System.out.println(k);
  }
}