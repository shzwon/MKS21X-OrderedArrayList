import java.util.ArrayList;

public class NoNullArrayList<T> extends OrderedArrayList<T>{
  public NoNullArrayList(){

  }
  public NoNullArrayList(int startVal){
    super(startVal);
  }

  public T set(int index, T value) {
    if (value == null)
      throw new IllegalArgumentException();
    return  super.set(index,value);
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException();
    super.add(value);
    return true;
    }

  public void add(int index, T value){
    if (value == null)
      throw new IllegalArgumentException();
    super.add(index,value);
  }

}
