import java.util.Scanner;
import java.util.TreeSet;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElements = sc.nextInt();

        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < numberOfElements; i++) {
            ts.add(sc.nextInt());
        }
        sc.close();

        System.out.println(ts.size());
    }
}
