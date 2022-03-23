package com.company;

import com.company.implementate.Node;
import com.company.implementate.Stiva;
import com.company.model.Masina;
import org.junit.jupiter.api.Test;

class StivaTest {

    @Test
    public void push() {
        Stiva stiva = new Stiva();

        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        stiva.push(m);
        stiva.push(m2);
        stiva.push(m3);
        stiva.push(m4);

        Node<Masina> it = stiva.iterator();
        while (it != null) {
            System.out.println(it.getData());
            it = it.getNext();
        }

    }

    @Test
    public void pop() {

        Stiva stiva = new Stiva();
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        stiva.push(m);
        stiva.push(m2);
        stiva.push(m3);
        stiva.push(m4);

        stiva.pop();

        Node<Masina> it = stiva.iterator();
        while (it != null) {
            System.out.println(it.getData());
            it = it.getNext();
        }
    }

    public void top() {

        Stiva stiva = new Stiva();
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        stiva.push(m);
        stiva.push(m2);
        stiva.push(m3);
        stiva.push(m4);


    }

    @Test
    public void isEmpty() {

        Stiva stiva = new Stiva();
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);



        System.out.println(stiva.isEmpty());


    }

}
