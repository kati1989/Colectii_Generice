package com.company.implementate;

public class Stiva <T>{

   private Lista<T>lista;

    public Stiva(){
        lista=new ListaImpl<>();

    }
    public Node<T>iterator(){
        return lista.iterator();
    }


    public void push(T obj){
        lista.addStart(obj);

    }



    public  void pop(){
    lista.removeFirst();
    }

    public T top(){
        return this.lista.iterator().getData();
    }
    //top,isEmpty

    public boolean isEmpty(){
       return lista.isEmpty();
    }



}
