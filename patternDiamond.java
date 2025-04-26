import java.util.*;
public class patternDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the odd number of rows  : ");
        int n=sc.nextInt();
        for(int i=0;i<=n/2;i++){
            for(int j=n/2;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m=n/2-1;m>=0;m--){
            for(int k=m;k<n/2;k++){
                System.out.print(" ");
            }
            for(int l=0;l<(2*m)+1;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}


/*

    *
   ***
  *****
   ***
    *

 */