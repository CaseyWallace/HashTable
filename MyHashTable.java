import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class MyHashTable<T> implements ICollection<T> {

    private int size = 0;
    private ArrayList[] table = new ArrayList[2];

    //COMPLETE
    public MyHashTable(){
        for(int i = 0; i < table.length; i++) {
            table[i] = new ArrayList();
        }
    }

    //COMPLETE
    @Override
    public Iterator<T> iterator() {
        return new MyHashTableIterator(this);
    }

    //COMPLETE
    @Override
    public boolean add(T toAdd) {
        boolean success = false;
        int index = getIndex(toAdd);
        table[index].add(toAdd);
        size++;
        success = true;
        if (checkSize()) {
            rehash(true);
        }
        return success;
    }

    //COMPLETE
    @Override
    public boolean addAll(Collection<T> values) {
        boolean success = false;
        for(int i = 0; i < values.size(); i++) {
            add((T) values.toArray()[i]);
        }
        success = true;
        return success;
    }

    //COMPLETE
    @Override
    public void clear() {
        table = new ArrayList[2];
        size = 0;
    }

    //COMPLETE
    @Override
    public boolean contains(T item) {
        int index = getIndex(item);
        boolean exists = false;
        for(int i = 0; i < table[index].size(); i++) {
            if (table[index].get(i).equals(item)) {
                exists = true;
            }
        }
        return exists;
    }

    //COMPLETE
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    //COMPLETE
    @Override
    public void updateAll(T oldValue, T newValue) {
        int index = getIndex(oldValue);
        for(int i = 0; i < table[index].size(); i++){
            if (table[index].get(i).equals(oldValue)){
                table[index].set(i, newValue);
            }
        }
        rehash(false);
    }

    //COMPLETE
    @Override
    public boolean remove(T item) {
        boolean success = false;
        int index = getIndex(item);
        table[index].remove(item);
        success = true;
        return success;
    }

    //COMPLETE
    @Override
    public int size() {
        return size;
    }

    //COMPLETE
    private int hash(T item) {
        int returnValue;
        if (item instanceof Integer){
            returnValue = (int) item;
        }
        else {
            returnValue = item.hashCode();
        }
        return returnValue;
    }

    //COMPLETE
    private void expand() {
        table = new ArrayList[table.length * 2];
        for(int i = 0; i < table.length; i++){
            table[i] = new ArrayList();
        }
    }

    //COMPLETE
    private void rehash(boolean expands) {
        ArrayList hold = new ArrayList();
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[i].size(); j++) {
                hold.add(table[i].get(j));
            }
        }
        if (expands) {
            size = 0;
            expand();
            for(int i = 0; i < hold.size(); i++){
                add((T) hold.get(i));
            }
        }
    }

    //COMPLETE
    private boolean checkSize(){
        boolean needRehash = false;
        for(int i = 0; i < table.length; i++) {
            if (table[i].size() == table.length) {
                needRehash = true;
            }
        }
        return needRehash;
    }

    //COMPLETE
    private int getIndex(T item){
        return hash(item) % table.length;
    }

    @Override
    public String toString(){
        String returnString = "";
        for(int i = 0; i < table.length; i++){
            returnString += table[i].toString() + "\n";
        }
        return returnString;
    }
    
    @SuppressWarnings("unchecked")
    public T get(int index){
        T value = null;
        int location = -1;
        for (int i = 0; i < table.length; i++){
            if (!table[i].isEmpty()){
                for (int j = 0; j < table[i].size(); j++){
                    value = (T) table[i].get(j);
                    location++;
                    if (location == index){
                        break;
                    }
                }
            }
            if (location == index) {
                break;
            }
        }
        return value;
    }
}