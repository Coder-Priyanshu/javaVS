import java.util.ArrayList;
import java.util.Scanner;

class BinarySearch {
    int binarySearch(ArrayList<Integer> array, int element) {

        int left = 0;
        int right = array.size() - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (array.get(mid) == element) {
                return mid;
            } else if (array.get(mid) < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }
}
public class binarySearchAlgo {
    public static void main(String[] args) {
        int x;
        int element;
        Scanner sc = new Scanner(System.in);

        BinarySearch ob = new BinarySearch();

        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>(n);

        System.out.println("Enter Array Only In Ascending Order.");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " : ");
            x = sc.nextInt();
            array.add(i, x);
        }

        System.out.print("Enter element for searching :: ");
        element = sc.nextInt();
 
        int result = ob.binarySearch(array, element);
        if (result >= 0) {
            System.out.println("Element " + element + " is present at index " + result + " .");
        } else {
            System.out.println("Element not found !");
        }

        sc.close();
    }
}