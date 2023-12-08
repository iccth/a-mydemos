package com.example.javabase.controller;

public class BinaryPrinter {

    public static void printBinary(int max,int length) {
        for (int i = 0; i <= max-1; i++) {
            String binary = Integer.toBinaryString(i);
            String paddedBinary = String.format("%"+length+"s", binary).replace(' ', '0');
            System.out.println(paddedBinary);
        }
    }
    public static void main(String[] args) {
        printBinary(16,4);
        //printBinary(255,8);
    }
}
