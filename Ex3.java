import java.util.Scanner;

public class Ex3
{
  public static void main (String [] args) {
  Scanner sc = new Scanner (System.in);

  System.out.println("Введите a: ");
  int a=sc.nextInt();
  System.out.println("Введите b: ");
  int b=sc.nextInt();
  System.out.println("Введите с: ");
  int c=sc.nextInt();

  System.out.println("Введено: a="+a +"; b="+b +"; c="+c);
  int temp=0;
  temp=a;
  a=b;
  b=c;
  c=temp;
  System.out.println("После: a="+a +"; b="+b +"; c="+c);
 }
}