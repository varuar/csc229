/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_lab07;

/**
 *
 * @author 2018v
 */
public class LinearSearch {
 public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
        for(int i=0;i<n;i++)
{
            if(arr[i]==x)
                return i;
}
                return -1;
} 
    public static void main(String a[]){    
        int[] arr= {1,2,3,4,5,6};    
        int key = 3;    
        System.out.println(key+" is found at index: "+search(arr, key));    
    }    
}
//time complexity = O(n) & space complexity is O(1)
