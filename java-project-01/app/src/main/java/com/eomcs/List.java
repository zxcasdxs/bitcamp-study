package com.eomcs;

public interface List {
  
  boolean add(Object e);
  void add(int index, Object element);
  Object get(int index);
  Object set(int index, Object element);
  Object remove(int index);
  int size();
  Object[] toArray();
  
  void MyArrayList();
  

}
