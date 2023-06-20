package com.Array;

public class Finding_Missing_Number {

    public static int missingNum(int[] arr){
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        for(int num : arr){
            sum -=num;
        }
        return sum;
    }
    public static void main(String[] args) {

        int [] arr = {1,4,5,6,8,7,2};
        System.out.println(missingNum(arr));


    }
}
