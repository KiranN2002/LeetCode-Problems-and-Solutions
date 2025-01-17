package SortingDataStructure;

import java.util.Scanner;

public class SelectionSort {
    public static void selection_sort(int[] a, int n){
        int i, j, temp, min = -1;
        for(i=0; i<n-1; i++){
            min = i;
            for(j=i+1; j<n; j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter "+n+" array elements");
        int i;
        for(i=0; i<n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Array Before Sorting");
        for(i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        selection_sort(a,n);
        System.out.println("Array after sorting");
        for(i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
