package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr;
        int n, i, j, temp;
        System.out.print("Enter the number of elements: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter "+n+" elements:");
        for(i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        for(i=1;i<n;i++){
            for(j=0;j<(n-i);j++){
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting is:");
        for(i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
