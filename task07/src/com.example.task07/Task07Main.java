package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int elem: arr) {
            sum += elem;
        }
        return sum;
    }
}