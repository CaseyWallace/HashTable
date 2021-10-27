import java.util.ArrayList;
import java.util.Collection;

public class HashTableDriver{
    public static void main(String args[]) {

        //Initializes the MyHashTable and Array List to be added.  Tests the toAdd method.
        
        ICollection<Integer> ints = new MyHashTable<>();
        Collection<Integer> toAdd = new ArrayList<Integer>();
        toAdd.add(8);
        toAdd.add(6);
        toAdd.add(7);
        toAdd.add(5);
        toAdd.add(3);
        toAdd.add(0);
        toAdd.add(9);
        ints.addAll(toAdd);
        System.out.println("This is the initial MyHashTable: \n" + ints.toString());
        System.out.println("The size of the MyHashTable is " + ints.size());
        System.out.println("");
        
        //Tests adding a null value.

        // ints.add(null);
        // System.out.println("This is the MyHashTable after adding a null value. " + ints.toString());
        // System.out.println("The size of the mtArrayList after adding one more element is " + ints.size());
        // System.out.println("");
        
        //Tests the add method, and makes sure the size counter is updated.

        ints.add(1000);
        System.out.println("This is the MyHashTable after adding another value: \n" + ints.toString());
        System.out.println("The size of the MyHashTable after adding one more element is " + ints.size());
        System.out.println("");

        //Tests the contains method if true.
        if (ints.contains(7)) {
            System.out.println("7 is in the MyHashTable!");
        } else {
            System.out.println("7 is not in the MyHashTable!");
        }
        System.out.println("");

        //Tests the contains method if false.
        if (ints.contains(81)) {
            System.out.println("81 is in the MyHashTable!");
        } else {
            System.out.println("81 is not in the MyHashTable!");
        }
        System.out.println("");

        //Tests the updateAll method
        ints.add(7);
        ints.updateAll(7, 100);
        System.out.println("All instances of 7, including the one just added, have been updated to 100!: \n" + ints.toString());
        System.out.println("");

        //Tests the remove method.
        ints.remove(3);
        System.out.println("The first instance of 3 has been removed!: \n" + ints.toString());
        System.out.println("");

        //Tests the isEmpty method.
        if (ints.isEmpty()){
            System.out.println("The MyHashTable is empty!");
        } else {
            System.out.println("The MyHashTable is not empty!");
        }
        System.out.println("");

        //Tests the clear method, then retests the isEmpty method.
        ints.clear();
        if (ints.isEmpty()){
            System.out.println("The MyHashTable is empty!");
        } else {
            System.out.println("The MyHashTable is not empty!");
        }
        // System.out.println(ints.toString());
        // System.out.println("");

        //Creates movies to add to a new MyHashTable, adds the movies, and prints out the list of movies.
        Movie a = new Movie("Ferris Bueller's Day Off", 1986);
        Movie b = new Movie("Titanic", 1997);
        Movie c = new Movie("Rocky", 1976);
        Movie d = new Movie("Jaws", 1975);
        // Movie e = null;

        //Adds the created movies into the new MyHashTable object.
        ICollection<Movie> movies = new MyHashTable<>();
        movies.add(a);
        movies.add(b);
        movies.add(c);
        movies.add(d);
        // movies.add(e);

        //Tests the Iterator
        // System.out.println("The movies in the MyHashTable are:");
        // for(var m : ArrayList) {
        //     System.out.println(m);
        // }
    }
}