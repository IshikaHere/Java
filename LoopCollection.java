import java.util.List;
import java.util.ArrayList;
// difference between list and arraylist is


public class LoopCollection {
    public static void main(String[] args) {
        //imp topic - 10 or 5 marks
        List<Integer> numbers = new ArrayList<>();
        System.out.println("My numbers list before adding elements:" +numbers);
        //we have to first create an empty list then add elements to it
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("My numbers list after adding elements:" +numbers);
        //removing elements from the list
        numbers.remove(3);//index of element to be removed
        System.out.println("My numbers list after removing elements:" +numbers);
        //using list iterator for 10 marks
        for(int num: numbers){
            System.out.println("My numbers list using for loop:" +num);
        }
    }
}
