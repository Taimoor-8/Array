package com.Array;

public class Moving_Numbers_to_End {

    public static int[] move(int[] arr){
        int j = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] !=0){
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        Printing_Odd_Elements print = new Printing_Odd_Elements();
        int[] arr = {4,6,0,6,8,0,54,};
        int[] movedArray = move(arr);
        print.print(movedArray);
    }
}
