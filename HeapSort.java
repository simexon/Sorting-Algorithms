/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

public class HeapSort {

    public static void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int max = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && arr[leftChild] > arr[max]) {
            max = leftChild;
        }

        if (rightChild < n && arr[rightChild] > arr[max]) {
            max = rightChild;
        }

        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;

            heapify(arr, n, max);
        }
    }

    static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {11, 34, 9, 5, 16, 10, -5};//sample data

    
        System.out.println("Original array:");
        display(arr);
        sort(arr);

        System.out.println("Sorted array:");
        display(arr);
    }
}
