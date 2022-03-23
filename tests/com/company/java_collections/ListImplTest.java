package com.company.java_collections;

import com.company.implementate.ListaImpl;
import com.company.model.Comparator.ComparatorNumePersoana;
import com.company.model.Masina;
import com.company.model.Persoana;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListImplTest {

    @Test
    public void remove() {
        ListImpl listImpl = new ListImpl();
        Masina masina = new Masina("Vw,negru,electric,4000");
        listImpl.sterge(masina);
        listImpl.afiseaza();
    }
    @Test
    public  void update(){
        ListImpl listImpl=new ListImpl();
        Masina masina = new Masina("Vw,negru,electric,4000");
        listImpl.update(masina,9900);
        listImpl.afiseaza();
    }

    @Test
    public  void add(){
        ListImpl listImpl=new ListImpl();
        Masina masina = new Masina("Mazda,albastru,electric,5500");
        listImpl.add(masina);
        listImpl.afiseaza();
    }

    @Test
    public  void isMasina(){
        ListImpl listImpl=new ListImpl();
        listImpl.isMasina("Audi");
        assertEquals(true,listImpl.isMasina("Audi"));


    }
    @Test
    public  void sortTest(){
        ListImpl listImpl=new ListImpl();

        listImpl.exSort();

    }

    @Test
    public  void sortTest2(){
        ListImpl listImpl=new ListImpl();
        listImpl.exSort2Masina();

    }

    @Test
    public void sortPersoana(){
        List<Persoana> persoanas = new ArrayList<>();

        Persoana persoana1 = new Persoana(1, "Vali", 12, "Pacii nr 2");
        Persoana persoana2 = new Persoana(2, "Mihai", 32, "Libertatii nr 65");
        persoanas.add(persoana1);
        persoanas.add(persoana2);

        Collections.sort(persoanas, new ComparatorNumePersoana());
        Iterator<Persoana> it= persoanas.iterator();
        while(it.hasNext()){
            Persoana p=it.next();
            System.out.println(p.toString());
        }

    }

    @Test
    public void swap(){
        List<Persoana> persoanas = new ArrayList<>();

        Persoana persoana1 = new Persoana(1, "Vali", 12, "Pacii nr 2");
        Persoana persoana2 = new Persoana(2, "Mihai", 32, "Libertatii nr 65");
        persoanas.add(persoana1);
        persoanas.add(persoana2);

        Collections.sort(persoanas, new ComparatorNumePersoana());
        Iterator<Persoana> it= persoanas.iterator();
        while(it.hasNext()){
            Persoana p=it.next();
            System.out.println(p.toString());
        }

    }
}