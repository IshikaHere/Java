import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    // LinkedList is a data structure that consists of a sequence of elements, where each element points to the next one.
    // It is a linear data structure, meaning that the elements are arranged in a sequential manner.
    // The main difference between an array and a linked list is that arrays have a fixed size, while linked lists can grow and shrink dynamically.
    // This makes linked lists more flexible than arrays, but also less efficient for certain operations.
    public static void main(String[] args) {
        List<String> heroes = new LinkedList<>();
        System.out.println("My empty linked list:"+heroes);
        heroes.add("Superman");
        heroes.add("Batman");
        heroes.add("Spiderman");
        heroes.add("Ironman");
        heroes.add("Hulk");

        System.out.println("My linked list after adding elements:"+heroes);

        //removing elements from the linked list
        heroes.remove(2); //index of element to be removed
        heroes.remove("Hulk"); //element to be removed
        System.out.println("My linked list after removing elements:"+heroes);

        //getting elements from the linked list
        String temp = heroes.get(0); //first make temporary variable and it should be same type as the list
        System.out.println("My linked list using temp variable:"+temp);

        //iterating through the linked list
        System.out.println("My linked list using for loop:");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }
        //another was of iterating through the linked list
        System.out.println("My linked list using for each loop:");
        for (String hero : heroes) {
            System.out.println(hero);
        }
        heroes.add("Thor");
        System.out.println("My linked list after addiing:" +heroes);

        //to add an element at first
        ((LinkedList<String>) heroes).addFirst("Captain America");
        System.out.println("My linked list after adding first:" +heroes);

        //to add an element at last
        ((LinkedList<String>) heroes).addLast("Black Widow");
        System.out.println("My linked list after adding last:" +heroes);


    }
}
