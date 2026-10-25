// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-25, 04:02 p.m.
// Technique   for-loop-multiplication-table
// Time        O(1)
// Space       O(1)
// Insight     The implementation iterates through a fixed range from 1 to 10 inclusive to compute and print the product of the input integer and the current loop index.
// Interview   Before: "I would use a while loop to print the multiples." After: "Using a for loop with a fixed range of 1 to 10 is more idiomatic for this O(1) task, ensuring exactly 10 lines are printed as required by the problem constraints."
// Pitfalls    (1) Using an incorrect loop range, such as starting at 0 or ending before 10, violates the requirement to print the first 10 multiples.
// ──────────────────────────────────────────────────

import java.util.*;
public class solution{
    
    public static void table(int n){
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        for(int i=1;i<=10;i++){
            int multiply = n*i;
            System.out.println(n+" x "+i+" = "+multiply);
        }
    }
    
    public static void main(String[]args){
        table(2);
    }
}
