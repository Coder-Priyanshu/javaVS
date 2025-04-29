import java.util.ArrayList;
import java.util.Scanner;

public class dyanmicArray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(3);
        for(int i=0;i<3;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<3;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n"+list);
        sc.close();
    }
}
// Q-. Using list method print 2D array list :
// Q1. Swaping values in an Array
// Q2. Maximum values in an Array
// Q3. Reversing an Array
