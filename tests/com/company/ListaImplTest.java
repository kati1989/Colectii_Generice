package com.company;

import com.company.implementate.Lista;
import com.company.implementate.ListaImpl;
import com.company.implementate.Node;
import com.company.model.Masina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaImplTest {


    @Test
    void add() {

        Lista<Masina> masinaLista = new ListaImpl<>();

        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        //masinaLista.afisare();
        //assertEquals(true,masinaLista.contains(masina));

        System.out.println(lista.indexOf(m3));
    }


    @Test
    public void removeFirst() {
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.removeFirst();


        Node<Masina> it = lista.iterator();

        while (it != null) {

            System.out.println(it.getData().toString());
            it = it.getNext();
        }


    }

    @Test
    public void removeLast() {
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);

        lista.removeLast();

        Node<Masina> it = lista.iterator();

        while (it != null) {

            System.out.println(it.getData().toString());
            it = it.getNext();
        }

    }

    @Test
    public void removePoz() {
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        lista.removePoz(1);


        Node<Masina> it = lista.iterator();

        while (it != null) {

            System.out.println(it.getData().toString());
            it = it.getNext();
        }


    }


    @Test
    public void remove() {
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        lista.remove(2);


        Node<Masina> it = lista.iterator();

        while (it != null) {

            System.out.println(it.getData().toString());
            it = it.getNext();
        }


    }



    @Test
    void isEmpty() {

        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);

        lista.removeObj(m);
        assertEquals(false, lista.isEmpty());


        //System.out.println(masinaLista.toString());
    }

    @Test
    public void size() {
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
    }

    @Test
    public void contains() {
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        System.out.println(lista.contains(m));


    }

    @Test
    public void removeObj() {
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);

        lista.removeObj(m4);


        Node<Masina> it = lista.iterator();

        while (it != null) {

            System.out.println(it.getData().toString());
            it = it.getNext();
        }


    }

    @Test
    public  void addStart(){
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.addStart(m);
        lista.addStart(m4);

        Node<Masina>it= lista.iterator();
        while(it!=null){
            System.out.println(it.getData().toString());
            it=it.getNext();
        }
    }
    @Test
    public  void getObjIndex(){

        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        System.out.println(lista.getObjIndex(1).toString());

    }

    @Test

    public void setObj(){
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.add(m4);
        lista.setObj(m,3);
        assertEquals("BMW",lista.getObjIndex(3).getMarca());


    }

    @Test
    public void addPeOPoz(){
        Masina m = new Masina("BMW", "rosu", "benzina", 5000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 5000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 5000);

        ListaImpl<Masina> lista = new ListaImpl<>();
        lista.add(m);
        lista.add(m2);
        lista.add(m3);
        lista.addPeOPoz(m4,4);

        Node<Masina>it= lista.iterator();
        while(it!=null){
            System.out.println(it.getData().toString());
            it=it.getNext();
        }

    }


}
