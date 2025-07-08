import java.util.*;

public class AlternativePrime {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int minPenalty(int[] arr) {
        List<Integer> prime = new ArrayList<>();
        List<Integer> nonprime = new ArrayList<>();

        for (int i : arr) {
            if (isPrime(i)) prime.add(i);
            else nonprime.add(i);
        }

        Collections.sort(prime);
        Collections.sort(nonprime);

        int penalty = 0;

        if (prime.size() == nonprime.size()) {
            return penalty; // already balanced
        }

        if (prime.size() < nonprime.size()) {
            int diff = nonprime.size() - prime.size() - 1;
            for (int i = 0; i < diff; i++) {
                penalty += nonprime.get(i);
            }
        } else {
            int diff = prime.size() - nonprime.size() - 1;
            for (int i = 0; i < diff; i++) {
                penalty += prime.get(i);
            }
        }

        return penalty;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(minPenalty(arr));
    }
}
