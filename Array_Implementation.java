package Array;

import java.util.Scanner;

public class Array_Implementation {

    public static void display (int [] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
            System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i=0; i < arr.length; i++){
            System.out.println("Enter value at " + i + " position of array");
            arr[i] = sc.nextInt();
        }

        display(arr);
    }
}
