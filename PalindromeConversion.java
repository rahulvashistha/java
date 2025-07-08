import java.util.Scanner;

public class PalindromeConversion {

    public static boolean isPalindrome(int n) {
        String reversed = new StringBuilder(String.valueOf(n)).reverse().toString();
        return Integer.parseInt(reversed) == n;
    }

    public static int palindromeConvert(int n) {
        if (isPalindrome(n)) {
            return n;
        }
        String reversed = new StringBuilder(String.valueOf(n)).reverse().toString();
        int rev = Integer.parseInt(reversed);
        return palindromeConvert(n + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(palindromeConvert(n));
    }
}
