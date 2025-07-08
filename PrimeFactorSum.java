import java.util.Scanner;
public class Primefactorsum
{
    public static boolean isPrime(int n) 
    {
        if (n<2)
        {
            return false;
        }    
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumofprime = 0;
        sc.close();
        
        for(int i=2; i<= num; i++)
        {
            if(num%i==0 && Primefactorsum.isPrime(i))
            {
                sumofprime+=i;
            }
        }
        System.out.println(sumofprime);
    }
}
