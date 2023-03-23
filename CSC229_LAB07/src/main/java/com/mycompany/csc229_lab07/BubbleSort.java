/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc229_lab07;

/**
 *
 * @author 2018v
 */
public class BubbleSort {
    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
               //ToDo 3: complete this algorithm, test it, provide its time complexity
      		if(a[inner] > a[inner+1]) {
              	temp = a[inner];
               	a[inner] = a[inner+1];
               	a[inner+1] = temp;
              }
           }
       }
}      }

     // the time complexity of this algorithm using bubblesort is O(n^2)