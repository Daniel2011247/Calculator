import java.util.Scanner;
public class EvenOddnumbers{

       public static void main(String[] args){
              int num;
              Scanner fola = new Scanner(System.in);
              System.out.println("Enter number");
              num = fola.nextInt();
              if(num%2 == 0)
                        System.out.println("Num is an even number");
              else
                        System.out.print("Num is an even number");
                }
}