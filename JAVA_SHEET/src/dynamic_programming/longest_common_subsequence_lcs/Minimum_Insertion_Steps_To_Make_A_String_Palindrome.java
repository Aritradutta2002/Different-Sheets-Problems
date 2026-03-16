package dynamic_programming.longest_common_subsequence_lcs;

import java.util.Scanner;

public class Minimum_Insertion_Steps_To_Make_A_String_Palindrome {
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
        // TODO: Problem 1312 - Minimum Insertion Steps to Make a String Palindrome
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

