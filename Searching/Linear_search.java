package Searching;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr;
        int search, n, c;
        System.out.print("Enter number of elements in an array:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        arr=new int[n];
        System.out.println("Enter those "+n+" elements:");
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        System.out.print("enter the value to find:");
        search = s.nextInt();
        for(c=0 ; c<n; c++){
            if(arr[c]==search){
                System.out.print("Element found at index "+(c+1));
                break;
            }
            if(c == n){
                System.out.println("Element isn't found!!");
            }
        }
    }
}
