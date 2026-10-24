// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-25, 12:00 a.m.
// Technique   printf-formatted-output
// Time        O(1)
// Space       O(1)
// Insight     The implementation utilizes the printf format specifier %-15s to left-justify strings within a 15-character field and %03d to pad integers with leading zeros to a width of three.
// Interview   Before: "How do I handle fixed-width padding in Java?" After: "Use System.out.printf with flags like '-' for left-justification and '0' for zero-padding. This approach runs in O(1) time per line, ensuring the string occupies 15 characters and the integer exactly 3 digits as required."
// Pitfalls    (1) Using %d instead of %03d fails to pad integers with leading zeros as required by the problem statement.  (2) Omitting the minus sign in %-15s results in right-justification, which violates the requirement for left-justified strings.  (3) Failing to include the %n format specifier or \n causes the output to appear on a single line instead of separate lines.
// ──────────────────────────────────────────────────


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int n = sc.nextInt();

            System.out.printf("%-15s%03d%n", s, n);
        }

        System.out.println("================================");

        sc.close();
    }
}


