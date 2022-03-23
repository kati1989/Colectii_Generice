package controller;

import com.company.implementate.SetImpl;
import com.company.model.Masina;

import java.util.*;

public class ExercitiiSet {



     public void exSet(){

         Set<Masina> masini1 = new HashSet<>();

         Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
         Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
         Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
         Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
         Masina m5 = new Masina("Vw", "bej", "diesel", 3000);
         masini1.add(m1);
         masini1.add(m1);
         masini1.add(m2);
         masini1.add(m3);
         masini1.add(m3);
         masini1.add(m4);
         masini1.add(m4);
         masini1.add(m5);

         Iterator<Masina>it= masini1.iterator();
         while(it.hasNext()){
             Masina m= it.next();
             System.out.println(m.toString());
         }

     }

     public  void treeSet(){
         //Tree set foloseste comparatorul dupa pret si afiseaza in ordine crescatoare
         Set<Masina>masini=new TreeSet<>() ;

         Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
         Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
         Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
         Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
         Masina m5 = new Masina("Vw", "bej", "diesel", 3000);
         masini.add(m1);
         masini.add(m1);
         masini.add(m2);
         masini.add(m3);
         masini.add(m3);
         masini.add(m4);
         masini.add(m4);
         masini.add(m5);

         Iterator<Masina>it=masini.iterator();
         while(it.hasNext()){
             Masina m=it.next();
             System.out.println(m.toString());
         }




     }

}

