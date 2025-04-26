import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the size of the array : ");
        ArrayList<Integer>list=new ArrayList<>(5);
        int x;
        for(int i=0;i<5;i++){
            System.out.println("Enter element : ");
            x=sc.nextInt();
            list.add(x);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n"+list);
        System.out.println(Arrays.toString(list.toArray()));


        sc.close();

    }
}
