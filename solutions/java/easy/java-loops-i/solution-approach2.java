// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
// Problem     Java Loops I
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-25, 04:09 p.m.
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
