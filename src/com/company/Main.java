package com.company;

import com.company.implementate.ListaImpl;
import com.company.implementate.Node;
import com.company.java_collections.ListImpl;
import com.company.model.Animal;
import com.company.model.Comparator.ComparatorNumePersoana;
import com.company.model.Masina;
import com.company.model.Persoana;

public class Main {

    public static void main(String[] args) {
        ComparatorNumePersoana c=new ComparatorNumePersoana();
       Persoana persoana=new Persoana(1,"Andreea",23,"Matei Corvin nr 45");
       Persoana persoana1=new Persoana(2,"Mihai",45,"Liviu rebreanu nr 34");
        System.out.println(c.compare(persoana,persoana1));



    }
}
