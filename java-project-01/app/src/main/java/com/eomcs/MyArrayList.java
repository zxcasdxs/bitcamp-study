package com.eomcs;

import java.util.Arrays;

public class MyArrayList implements List {

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elementData;
  private int size;

  public MyArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      elementData = new Object[DEFAULT_CAPACITY];
    } else {
      elementData = new Object[initialCapacity];
    }
  }

  public boolean add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }

  private void grow() {
    int newCapacity = elementData.length + (elementData.length >> 1);
    elementData = Arrays.copyOf(elementData, newCapacity);
  }


  public void add(int index, Object element) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    for (int i = size; i > index ; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return elementData[index];
  }

  public Object set(int index, Object element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Object old = elementData[index];

    System.arraycopy(
        elementData,
        index + 1,
        elementData,
        index,
        this.size - (index + 1)
        );


    size--;
    elementData[size] = null;

    return old;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, this.size);
    return arr;

  }

  @Override
  public void MyArrayList() {
    // TODO Auto-generated method stub
    
  }
}




