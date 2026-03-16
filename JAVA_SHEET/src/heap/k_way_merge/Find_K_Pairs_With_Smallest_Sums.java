package heap.k_way_merge;

import java.util.Scanner;

public class Find_K_Pairs_With_Smallest_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            int t = 1;
            if (sc.hasNextInt()) {
                t = sc.nextInt();
            }
            while (t-- > 0) {
                solve(sc);
            }
        } else {
            runSampleTests();
        }

        sc.close();
    }

    static void solve(Scanner sc) {
        // TODO: Problem 373 - Find K Pairs with Smallest Sums
        // Write your solution here and read input using Scanner.
    }

    static void runSampleTests() {
        // TODO: Add sample tests for quick local runs.
        // Example:
        // String input = "1\\n...";
        // Scanner sample = new Scanner(input);
        // solve(sample);
        // sample.close();
    }

    static int[] readIntArray(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static long[] readLongArray(Scanner sc, int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        return arr;
    }
}

