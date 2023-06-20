package Array;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_Integer {

    public long reverse(int number){
        boolean isNegative = number < 0;
        if (isNegative){
            number = number*(-1);
        }
        long reverse = 0;
        int lastDigit;
        while (number > 0){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return isNegative ? reverse * (-1) : reverse;
    }

//    Reverse of integer while using string
    /*public long reverse(int number){
        boolean isNegative = number < 0;
        if (isNegative){
            number = number * (-1);
        }
        String str = Integer.toString(number);
        char [] arr = str.toCharArray();

        char [] temp = new char[arr.length];

        for (int i = 0; i < arr.length; i++){
            temp [i] = arr[arr.length -1 -i];
        }

        for (int i = 0; i < arr.length; i++){
            arr [i] = temp [i];
        }

        str = String.valueOf(arr);

        int reverse = Integer.parseInt(str);
        return isNegative ? reverse * (-1) : reverse;
    }*/

    public static void main(String[] args) {

        reverse_Integer ri =  new reverse_Integer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value to be reverse");
        int number = sc.nextInt();

        System.out.println("Integer after reversing it is " + ri.reverse(number));
    }
}
