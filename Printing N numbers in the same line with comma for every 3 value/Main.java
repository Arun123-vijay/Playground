import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int count = 4;
    for(int i=1;i<=a;i++){
      if(count == i){
        System.out.print(",");
        System.out.print(i);
        count+=3;
  }else
      {
        System.out.print(i);
      }
    }
}
}