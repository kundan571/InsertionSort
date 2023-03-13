package com.insertionsort;

public class InsertionSort {

    void insertionSort(String[] arr, int n){
        for (int i = 0; i < n; i++){
            String temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < arr[j].length()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    void printArray(String[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSortObj = new InsertionSort();
        String [] arr = {"kundan", "shubham", "rahul"};
        int n = arr.length;
        insertionSortObj.insertionSort(arr, n);
        insertionSortObj.printArray(arr, n);
    }
}
