import java.util.Scanner;

public class Ex5
{
  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("¬ведите a: ");
  int a=sc.nextInt();

  System.out.println("¬ведено a="+a);
  
  a=a*a;
  System.out.print(a);

  a=a*a;
  System.out.print(" "+a);
  
  a=a*a;
  System.out.print(" "+a);
 }
}