import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int arr[]=new int[3];
        // for(int i=0;i<arr.length;i++) {
        //     System.out.print("Enter the numbers "+i+" : ");
        //     arr[i]=sc.nextInt();
        // }

        // // Normal method to print array.
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }

        // More advanced and easy method to print array.
        // System.out.println(Arrays.toString(arr));
        
        // 2D Array 
        int[][] arr2=new int[3][2];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print("Enter Element at index "+i+","+j+": ");
                arr2[i][j]=sc.nextInt();
            }
        }

        // Printing of 2D array
        for (int i=0;i<arr2.length;i++) {
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        // Another way to print 2D array.
        for(int  i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
        
        // More advanced version to print array in single line
        System.out.println(Arrays.deepToString(arr2));
        sc.close();


    }
}
