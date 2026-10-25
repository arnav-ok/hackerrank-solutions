// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-25, 04:02 p.m.
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
