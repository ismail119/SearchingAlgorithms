package Sortings;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int sayi = Input.nextInt();
        System.out.println(CreateFibonacci(sayi));
    }

    private static int CreateFibonacci(int n) {
        if(n==1 || n==2) return 1;
        else
            return CreateFibonacci(n-1) + CreateFibonacci(n-2);
    }


    private static void PrintResult(int[] result) {
        for (int i:result) System.out.println(i);
    }
}
