package com.company.implementate;

public class Coada<T> {
    private Lista <T> lista;
    public Coada(){
        lista=new ListaImpl<>();
    }

    public Node<T>iterator(){
        return lista.iterator();
    }

    public  void push(T obj){
        lista.add(obj);
    }

    public void pop(){
        lista.removeFirst();
    }

    public T top(){
        return this.lista.iterator().getData();
    }

    public  boolean isEmpty(){
        return lista.isEmpty();
    }
}
