import java.util.Scanner;

public class Ex1
{
  public static void main (String [] args) {
  Scanner sc = new Scanner (System.in);
  System.out.println("Vvedite a: ");
  int a=sc.nextInt();
  System.out.println("Vvedite b: ");
  int b=sc.nextInt();
  System.out.println("Vvedeno: a="+a +"; b="+b);
  int temp=0;
  temp=a;
  a=b;
  b=temp;
  System.out.println("Posle: a="+a +"; b="+b);
 }
}