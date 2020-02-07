import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc =  new Scanner(System.in);
      int a = sc.nextInt();
      String b = String.valueOf(a);
      String c = b.substring(0,1);
      String d = b.substring(b.length()-1);
      int e = Integer.parseInt(c);
      int f = Integer.parseInt(d);
       int v = e + f;
      System.out.println(v);
	}
}