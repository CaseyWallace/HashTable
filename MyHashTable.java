import java.util.Collection;
import java.util.Iterator;

public class MyHashTable<T> implements ICollection<T> {

    private int size = 0;

    //COMPLETE
    @Override
    public Iterator<T> iterator() {
        return new MyHashTableIterator(this);
    }

    //TODO: Add in logic to add a new element.  If needed, expand the Hash Table.
    @Override
    public boolean add(T toAdd) {
        return false;
    }

    //TODO: Add in logic to add a full array of elements.
    @Override
    public boolean addAll(Collection<T> values) {
        return false;
    }

    //TODO: Add in logic to clear the Hash Table.
    @Override
    public void clear() {
        
    }

    //TODO: Add in logic to check if the Hash Table contains a value.
    @Override
    public boolean contains(T item) {
        return false;
    }

    //COMPLETE
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    //TODO: Add in logic to update all instances of a value to a new value.
    @Override
    public void updateAll(T oldValue, T newValue) {
        
    }

    //TODO: Add in logic to remove an item.
    @Override
    public boolean remove(T item) {
        return false;
    }

    //COMPLETE
    @Override
    public int size() {
        return size;
    }

    //TODO: Add in logic to get an item at a given index.
    public T get(int i) {
        return null;
    }

}