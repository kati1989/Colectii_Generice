package com.company;

import com.company.implementate.Coada;
import com.company.implementate.Node;
import com.company.model.Masina;
import org.junit.jupiter.api.Test;

class CoadaTest {

    @Test
    public void push(){

     Coada fifo=new Coada();
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);
        fifo.push(m);
        fifo.push(m2);
        fifo.push(m3);
        fifo.push(m4);

        Node<Masina> it= fifo.iterator();
        while(it!=null){
            System.out.println(it.getData().toString());
            it=it.getNext();
        }

    }

    @Test
    public void pop(){
        Coada fifo=new Coada();
        Masina m1 = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);
        fifo.push(m1);
        fifo.push(m2);
        fifo.push(m3);
        fifo.push(m4);

        fifo.pop();
        Node<Masina >it=fifo.iterator();
        while(it!=null){
            System.out.println(it.getData().toString());
            it=it.getNext();
        }

    }

    @Test

    public  void isEmpty(){
        Coada fifo=new Coada();
        Masina m1 = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);
//        fifo.push(m1);
//        fifo.push(m2);
//        fifo.push(m3);
//        fifo.push(m4);

        System.out.println(  fifo.isEmpty());

    }


}