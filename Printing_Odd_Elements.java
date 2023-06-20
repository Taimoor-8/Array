package com.Array;

public class Printing_Odd_Elements {

    public void print(int [] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }

        int[] oddArray = new int[oddCount];
        int ind = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]%2 != 0){
                oddArray[ind] = arr[i];
                ind++;
            }
        }
        return oddArray;
    }
    public static void main(String[] args) {

        Printing_Odd_Elements odd = new Printing_Odd_Elements();
        int[] array = {4,5,6,8,2,5,23,5,7};
        int [] result = odd.removeEven(array);
        odd.print(result);


    }
}
