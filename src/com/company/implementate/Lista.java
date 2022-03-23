package com.company.implementate;

public interface Lista <T>{
    void add(T obj);

    void remove(int poz);

    void removePoz(int poz);

    boolean contains(T data);

    void removeObj(T data);

    boolean isEmpty();

    int size();

    void removeFirst();

    void removeLast();

    void addStart(T obj);

    Node<T> iterator();


}
