import java.util.*;

public class Anagram {

    public static boolean canFormPalindrome(String str) {
        int[] alphabet = new int[26];
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a']++;
            }
        }

        int oddCount = 0;
        for (int count : alphabet) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        if (canFormPalindrome(str)) {
            System.out.println("1");  // or "Yes, it can be rearranged into a palindrome."
        } else {
            System.out.println("0");
        }
    }
}
