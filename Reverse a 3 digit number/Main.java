import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int num=in.nextInt();
    int a=num/100;
    int c=num%10;
    int b=(num%100)/10;
    System.out.print(c);
    System.out.print(b);
    System.out.print(a);
  }
}