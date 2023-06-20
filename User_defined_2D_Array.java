import java.util.Scanner;
public class User_defined_2D_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // For matrix 1
        System.out.println("Enter number of rows for matrix 1");
        int r = sc.nextInt();
        System.out.println("Enter number of columns for matrix 1");
        int c = sc.nextInt();
        int [][]mat1 = new int [r][c];
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[0].length; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int[] ints : mat1) {
            for (int j = 0; j < mat1[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("");
        }
        // For matrix 2
        System.out.println("Enter number of rows for matrix 2");
        int a = sc.nextInt();
        System.out.println("Enter number of columns for matrix 2");
        int b = sc.nextInt();
        int [][]mat2 = new int [a][b];
        for(int i=0; i<mat2.length; i++){
            for(int j=0; j<mat2[0].length; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int[] ints : mat2) {
            for (int j = 0; j < mat2[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("");
        }
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};
        for(int i=0; i<mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                System.out.format("Setting values for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i =0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.println(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("");
    }
}