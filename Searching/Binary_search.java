package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr;
        int first, last, middle, n, search,c;
        System.out.print("Enter the number of elements:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        arr=new int[n];
        System.out.println("Enter the "+n+" elements:");
        for(c=0;c<n;c++){
            arr[c]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array after sorting is: "+ Arrays.toString(arr));
       /* for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        } */
        first=0;
        last=n-1;
        middle = (first+last)/2;
        System.out.print("Enter the element to search:");
        search = s.nextInt();
        while(first<=last){
            if(arr[middle]<search){
                first=middle+1;
            }
            else if(arr[middle] == search){
                System.out.print(search+" found at location "+middle+1);
                break;
            }
            else
                last = middle - 1;
            middle = (first+last)/2;
        }
        if(first>last){
            System.out.print("Element doesn't found!!");
        }
    }
}
