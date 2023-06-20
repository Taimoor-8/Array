package com.Array;

public class reversing_Array {

    public int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {

        reversing_Array rev = new reversing_Array();
        Printing_Odd_Elements print = new Printing_Odd_Elements();
        int[] arr = {5,6,3,8,0,2,3,4};
        int[] reverse = rev.reverse(arr);
        print.print(reverse);
    }
}
