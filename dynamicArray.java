import java.util.ArrayList;

public class dynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(3);//Here the capacity is only 3.
        list.add(23);
        list.add(53);
        list.add(22);
        list.add(98);
        list.add(78);   //Here we can add any number of input in the list ,Since we use Arraylist.
        System.out.println(list);
        list.add(2,50); //Adding to number in the list at the given index.
        list.set(4, 75); //Setting the value of the number at the given index,i.e, replacing it.
        System.out.println(list.contains(50)); //Checking if the number is present in the list or not.
        list.addLast(100); //Adding the number at the last of the list.
        list.remove(3); //Removing the element from the given index.
        System.out.println(list);


    }
}
