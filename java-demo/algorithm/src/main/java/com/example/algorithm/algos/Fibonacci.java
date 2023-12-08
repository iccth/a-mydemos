package com.example.algorithm.algos;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class Fibonacci  {
    public static BigInteger[] fibonacci(int n){
        BigInteger[] fib = new BigInteger[n];
        fib[0]=BigInteger.ONE;
        fib[1]=BigInteger.ONE;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1].add(fib[i-2]);
        }
        return fib;
    }
}
