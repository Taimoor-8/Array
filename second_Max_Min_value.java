package com.Array;

public class second_Max_Min_value {

    public static int secondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if (arr[i]>secMax && arr[i]!=max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

    public static int secondMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if (arr[i]<min){
                secMin = min;
                min = arr[i];
            }
            else if (arr[i]<min && arr[i]!= min) {
                secMin = arr[i];
            }
        }
        return secMin;
    }
    public static void main(String[] args) {

        int [] arr = {6,8,4,2,55,67,43,9};
        System.out.println("The second max value of array is "+secondMax(arr));
        System.out.println("The second min value of array is "+secondMin(arr));
    }
}
