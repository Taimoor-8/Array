package Array;

import java.util.Scanner;

public class Bounds_Check {

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

        System.out.println("Enter the value at which you want to insert value at ");
        int index = sc.nextInt();

        if (index < arr.length -1 && index >= 0){
            System.out.println("Enter the value ");
            arr[index] = sc.nextInt();
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Enter value from 0 to " + (n-1));
        }

        display(arr);
    }
}
