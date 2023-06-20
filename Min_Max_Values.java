package Array;

public class Min_Max_Values {

    public static int minValue(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maxValue(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {4,6,3,6,8,2,44,68,54};
        System.out.println("The minimum value of array is "+minValue(arr)+"\n");
        System.out.println("The maximum value of array is "+maxValue(arr));
    }
}
