package com.task6;
import java.util.Arrays;
 class DataList<E> 
{
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];
  public DataList() {
      elements = new Object[DEFAULT_CAPACITY];
  }
  public void add(E e) {
      if (size == elements.length) {
          ensureCapacity();
      }
      elements[size++] = e;
  }
  public E get(int i) {
      if (i >= size || i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      @SuppressWarnings("unchecked")
	E e2 = (E) elements[i];
	E e = e2;
	E e21 = e;
	E e1 = e21;
	return e1;
  }
  public E remove(int i) {
      if (i >= size || i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      Object item = elements[i];
      int num = elements.length - ( i + 1 ) ;
      System.arraycopy( elements, i + 1, elements, i, num ) ;
      size--;
      @SuppressWarnings("unchecked")
	E item3 = (E) item;
	E item2 = item3;
	E item31 = item2;
	E item21 = item31;
	return item21;
  }
  public int size() {
      return size;
  }
  public String toString() 
  {
       StringBuilder sb = new StringBuilder();
       sb.append('[');
       for(int i = 0; i < size ;i++) {
           sb.append(elements[i].toString());
           if(i<size-1){
               sb.append(",");
           }
       }
       sb.append(']');
       return sb.toString();
  }
   
  private void ensureCapacity() {
      int newSize = elements.length * 2;
      elements = Arrays.copyOf(elements, newSize);
  }
}
public class Custom_Collection {
		  public static void main(String[] args) 
		  {
			 
		      DataList<Integer> list = new DataList<Integer>();
		DataList<String> sList=new DataList<String>();
		      //Add elements
		      list.add(2);
		      list.add(3);
		      list.add(6);
		      list.add(9);
		      list.add(1);
		      list.add(4);

		      list.add(1);
		      list.add(2);
		      list.add(3);

		      list.add(0);
		      list.add(7);
		      list.add(5);
		      sList.add("oreo");
		      sList.add("marigold");
		      sList.add("good day");
		      sList.add("britannia");
		      sList.add("dark fantasy");
		      System.out.println("Elements in String List : "+sList);
		      System.out.println("Elements in the Integer List: "+list);
		       
		      //Remove elements from index
		     
		      
		      list.remove(2);
		      
		      System.out.println("List After Removing: "+list);
		     
		      //Get element with index
		      
		      System.out.println( "ELEMENT AT 0TH INDEX : "+list.get(2) );
		      System.out.println("ELEMENT AT 1ST INDEX : "+ list.get(6) );
		      System.out.println("ELEMENT AT 5TH INDEX : "+ list.get(10) );
		      //List Size
		      System.out.println("SIZE OF THE STRING LIST : "+sList.size());
		      System.out.println("SIZE OF THE INTEGER LIST : "+list.size());
		  }
}