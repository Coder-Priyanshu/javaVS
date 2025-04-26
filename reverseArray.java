import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8};
        int front=0;
        int rear=arr.length-1;
        while(front<rear){
            int temp=arr[front];
            arr[front]=arr[rear];
            arr[rear]=temp;
            front++;
            rear--;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe maximum value in this given array is "+max+".");
        
        sc.close();
    }
}
