package Array;

public class Resizing_Array {

    public static int[] resize(int []arr, int cap){
        int[] temp = new int[cap];
        for (int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {

        com.Array.Printing_Odd_Elements print = new com.Array.Printing_Odd_Elements();
        int [] arr = {5,8,2,4,98,43,6};
        print.print(resize(arr, arr.length*2));
        System.out.println("The size of array is "+resize(arr,arr.length*2).length);
    }
}
