package Array;

import java.util.Scanner;

public class is_Subsequence {

    public boolean isSubSeq(String str , String seq){
        int i = 0;
        int j = 0;
        while (i < str.length() && j < seq.length()){
            if (str.charAt(i) == seq.charAt(j)){
                j++;
            }
            i++;
        }
        return j == seq.length();
    }

    public static void main(String[] args) {

        is_Subsequence is = new is_Subsequence();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println("Enter the sunString to be examined");
        String seq = sc.nextLine();

        if (is.isSubSeq(str , seq)){
            System.out.printf("The string '%s' is a subSequence of string '%s' " , seq , str);
            System.out.println();
        }
        else{
            System.out.printf("The string '%s' is not a subSequence of string '%s' " , seq , str);
            System.out.println();
        }
    }
}
