import java.util.ArrayList;

public class NoNullArrayList<T> extends OrderedArrayList<T>{
  public NoNullArrayList(){

  }
  public NoNullArrayList(int startVal){
    super(startVal);
  }

  public set() {

  }

  public add(T value){
    if (value == null)
      throw new IllegalArgumentException();
    else
      super.add(value);
      return true;
  }

  public void add(int index, T value){
    if (value == null)
      throw new IllegalArgumentException();
    else
      super.add(index,value);
  }

}
