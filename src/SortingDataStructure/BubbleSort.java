package SortingDataStructure;
import java.util.*;
public class BubbleSort {
    public static void bubble_sort(int[] a, int  n){
        int i, j, temp;
        for(i=0; i<n; i++){
            for(j=0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
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
        bubble_sort(a,n);
        System.out.println("Array after sorting");
        for(i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }

    }
}
