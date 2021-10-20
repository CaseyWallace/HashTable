import java.util.Iterator;

public class MyHashTableIterator<T> implements Iterator<T>{

  MyHashTable mht;
  int index = 0;

  public MyHashTableIterator(MyHashTable mht){
    this.mht = mht;
  }

  @Override
  public boolean hasNext() {
    return index < mht.size();
  }

  @SuppressWarnings("unchecked")
  @Override
  public T next() {
    return (T) mht.get(index++);
  }
  
}