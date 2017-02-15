import java.util.Scanner;

public class Ex4
{
  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("Введите a: ");
  int a=sc.nextInt();
  System.out.println("Введите b: ");
  int b=sc.nextInt();
  System.out.println("Введено: a="+a +"; b="+b);
  
  a=a+b;
  b=b-a;
  b=-b;
  a=a-b;
  System.out.println("После: a="+a +"; b="+b);
 }
}