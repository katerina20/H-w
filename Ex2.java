import java.util.Scanner;

public class Ex2
{
  public static void main (String [] args) {
  Scanner sc = new Scanner (System.in);

  System.out.println("������� a: ");
  int a=sc.nextInt();
  System.out.println("������� b: ");
  int b=sc.nextInt();
  System.out.println("������� �: ");
  int c=sc.nextInt();

  System.out.println("�������: a="+a +"; b="+b +"; c="+c);
  int temp=0;
  temp=a;
  a=c;
  c=b;
  b=temp;
  System.out.println("�����: a="+a +"; b="+b +"; c="+c);
 }
}