package Sorting;
import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        int n,temp,j;
        int[] data;
        System.out.print("Enter number of elements to be sorted: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        data = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            data[i]= s.nextInt();
        }
        for (int i = 1; i < n; i++) {
            temp = data[i];
            j = i - 1;
            while(temp < data[j] && j > 0){
                data[j+1]=data[j];
                j=j-1;
            }
            data[j+1]=temp;
        }
        System.out.print("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
