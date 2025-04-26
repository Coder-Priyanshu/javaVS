import java.util.ArrayList;
import java.util.Scanner;

public class linearSearchAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>(5);
        int x;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter element at index " + i + " : ");
            x = sc.nextInt();
            array.add(i, x);
        }
        System.out.print("\nEnter element for searching :: ");
        int element = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (element == array.get(i)) {
                System.out.println("Element " + element + " found at index " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}
