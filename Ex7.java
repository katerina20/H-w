import java.util.Scanner;

public class Ex7
{
  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("Введите температуру в градусах Фаренгейта: ");
  float tf=sc.nextInt();
  
  float tc=(tf-32)*5/9;
  
  
  System.out.printf("Температура в градусах Цельсия = %.2f",tc);
 }
}