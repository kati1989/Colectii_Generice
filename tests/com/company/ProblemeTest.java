package com.company;

import com.company.implementate.Lista;
import com.company.implementate.ListaImpl;
import com.company.implementate.Node;
import com.company.implementate.Stiva;
import com.company.model.Persoana;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Vector;

public class ProblemeTest {
    //Folosind o stiva sa se inverseze un string
    @Test
    public void inversareString() {

        String text = "Ana are mere";
        Stiva<Character> caractere = new Stiva<>();

        for (int i = 0; i < text.length(); i++) {
            caractere.push(text.charAt(i));


        }
        text = "";


        while (caractere.isEmpty() == false) {

            text += caractere.top();

            caractere.pop();
        }


        System.out.println(text);

    }

    //Folosind o stiva sa se inverseze un vector
    @Test
    public void inversareVector() {
        ArrayList<Persoana> persoane = new ArrayList<>();
        Persoana persoana = new Persoana(1, "Alin", 23, "Dezrobirii nr 4");
        Persoana persoana2 = new Persoana(2, "Mihai", 23, "Dezrobirii nr 4");

        persoane.add(persoana);
        persoane.add(persoana2);

        Stiva<Persoana> stiva = new Stiva<>();

        for (int i = 0; i < persoane.size(); i++) {
            stiva.push(persoane.get(i));
        }

        persoane.clear();
        //inversare vector
        while (stiva.isEmpty() == false) {
            persoane.add(stiva.top());
            stiva.pop();
        }
        //print array
        for (int i = 0; i < persoane.size(); i++) {
            System.out.println(persoane.get(i).toString());
        }

    }
}
