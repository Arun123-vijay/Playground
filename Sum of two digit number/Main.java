import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int c,sum=0;
      while(a!=0){
        c = a%10;
        sum = sum+c;
        a = a/10;
	}
      System.out.println(sum);
}
}