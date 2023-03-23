/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_lab07;

/**
 *
 * @author 2018v
 */
public class BinarySearch {
  public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
     //ToDo 2: Call the above method and test the algorithm  
    public static void main(String[] args) {
       int[] arr = { 1, 3, 5, 7, 9 };
        int key1 = 5;
         int key2 = 4;
            int index1 = BinarySearch.runBinarySearchIteratively(arr, key1, 0, arr.length - 1);
         int index2 = BinarySearch.runBinarySearchIteratively(arr, key2, 0, arr.length - 1);
            System.out.println("Index of " + key1 + ": " + index1);
             System.out.println("Index of " + key2 + ": " + index2);
       // provide time and space analysis 
       //time complexity is O(log n) and the space complexity is O(1)
    }       
}