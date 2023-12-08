package com.example.algorithm;

import com.example.algorithm.algos.BubbleSort;
import com.example.algorithm.algos.Fibonacci;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

@SpringBootTest
class AlgorithmApplicationTests {

    @Autowired
    private BubbleSort bubbleSort;

    @Autowired
    private Fibonacci fibonacci;

    @Test
    void contextLoads() {
    }

    @Test
    void testIterationBubbleSort(){
        int[] arr = {5,9,3,4,5};
        bubbleSort.iterationBubbleSort(arr);
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }

    @Test
    void testRecursiveBubbleSort(){
        int[] arr = {5,9,3,4,5};
        int n = arr.length;
        bubbleSort.recursiveBubbleSort(arr,n);
        System.out.println(arr.toString());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }

    @Test
    void testFabonacci(){
        int n = 30;
        BigInteger[] fibnacci = Fibonacci.fibonacci(n);
        for (int i = 0; i < fibnacci.length; i++) {
            System.out.println((i+1) + " " + fibnacci[i]);
        }
    }
}
