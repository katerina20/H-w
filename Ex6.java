import java.util.Scanner;

public class Ex6
{
  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("������� ����������� � �������� �������: ");
  float tc=sc.nextInt();
  
  float tf=tc*9/5+32;
  
  
  System.out.printf("����������� � �������� ���������� = %.2f", tf);
 }
}