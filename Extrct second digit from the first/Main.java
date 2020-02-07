import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String b = String.valueOf(a);
      String c = b.substring(1,2);
      int d = Integer.parseInt(c);
      System.out.println(d);
	}
}