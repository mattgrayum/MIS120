import java.util.Scanner;

public class Practice14
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      //Animal dog = new Animal();
      //dog.walk();
      
      Bird crow = new Bird();
      crow.walk();
      crow.fly();
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      System.out.println("Sum of divisors for " + n + " = " + divisor_sum(n));
   }
   public static int divisor_sum(int n){
        int total = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                total += i;
            }
        }
        return total;
    }
}