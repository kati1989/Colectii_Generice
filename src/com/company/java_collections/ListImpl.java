package com.company.java_collections;

import com.company.implementate.Node;
import com.company.model.Comparator.ComparatorMarcaMasina;
import com.company.model.Comparator.ComparatorNumePersoana;
import com.company.model.Masina;
import com.company.model.Persoana;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class ListImpl {

    private List<Masina> list;


    public ListImpl() {
        this.list = new ArrayList<>();
        load();
    }

    public void load() {
        File file = new File("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Colectii_Generice\\src\\com\\company\\input.txt");
        try {
            Scanner scanner = new Scanner(file);


            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();
                this.list.add(new Masina(linie));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //afisare lista
    public void afiseaza() {
        Iterator<Masina> iterator = list.iterator();

        while (iterator.hasNext()) {

            Masina m = iterator.next();
            System.out.println(m);
        }
    }

    //stergem de pe o  masina
    public void sterge(Masina m) {
        Iterator<Masina> it = list.iterator();
        while (it.hasNext()) {
            Masina t = it.next();
            if (t.equals(m)) {
                it.remove();
            }
        }
    }

    public void update(Masina m, int pret) {
        Iterator<Masina> it = list.iterator();
        while (it.hasNext()) {
            Masina t = it.next();
            if (t.equals(m)) {
                t.setPret(pret);
            }
        }

    }

    public void add(Masina m) {
        list.add(m);

    }


    public boolean isMasina(String marca) {
        Iterator<Masina> it = list.iterator();
        while (it.hasNext()) {
            Masina t = it.next();
            if (t.getMarca().equals(marca)) {
                return true;
            }
        }
        return false;
    }


    public void exSort() {

        Collections.sort(list);

        afiseaza();
    }


    public void exSort2Masina() {

        //sort(List<T> list, Comparator<? super T> c)
        Collections.sort(list, new ComparatorMarcaMasina());
        afiseaza();

    }
    public void exSwap(){
        Collections.swap(list,1,2);

    }

//swap(List<?> list, int i, int j)

}
