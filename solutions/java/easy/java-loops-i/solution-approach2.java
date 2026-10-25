// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-25, 04:09 p.m.
// Technique   for-loop-multiplication
// Time        O(1)
// Space       O(1)
// Insight     The loop iterates exactly ten times, maintaining the invariant that the index i represents the multiplier from 1 to 10 inclusive.
// Interview   Before: "I would use a while loop to print the multiples." After: "A for loop is more idiomatic here since the range is fixed at 1 to 10, resulting in O(1) time and space complexity regardless of the input integer N."
// Pitfalls    (1) Using a loop condition of i < 10 instead of i <= 10, which fails to print the tenth multiple as required by the problem statement.  (2) Starting the loop index at 0 instead of 1, which produces an incorrect N x 0 = 0 output line.
// ──────────────────────────────────────────────────

import java.util.*;
public class solution{
    
    public static void table(int n){
       
        for(int i=1;i<=10;i++){
            int multiply = n*i;
            System.out.println(n+" x "+i+" = "+multiply);
        }
    }
    
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
        table(num);
    }
}
