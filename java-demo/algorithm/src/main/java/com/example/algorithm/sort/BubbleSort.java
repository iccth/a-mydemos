package com.example.algorithm.sort;

public class BubbleSort {

    /**
     * 双重for循环迭代实现冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void bubbleSortRecursion(int[] arr, int n){
        if (n == 1) {
            return;
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        bubbleSortRecursion(arr, n-1);
    }


//    public static void main(String[] args) {
//        int[] arr={9,7,8,6,5,4,3,2,1};
//        bubbleSort(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }

    public static void main(String[] args) {
        int[] arr={64,34,25,12,22,11,90};
        int n=arr.length;
        bubbleSortRecursion(arr,n);
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
