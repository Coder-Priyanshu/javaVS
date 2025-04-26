import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[5];
            for(int i=0;i<5;i++){
                System.out.print("Enter the number "+ i+" :");
                arr[i]=sc.nextInt();
            }
            for (int i : arr) {
                System.out.print(i+" ");
            }
        }
        
    }
}
