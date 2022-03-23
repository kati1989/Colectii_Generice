package com.company;

import com.company.implementate.ListaImpl;
import com.company.implementate.Node;
import com.company.implementate.SetImpl;
import com.company.model.Masina;
import org.junit.jupiter.api.Test;

class SetImplTest {

//    @Test
  //  public  void add(){
//        SetImpl<Masina> set=new SetImpl();
//
//        Masina m1 = new Masina("BMW", "rosu", "benzina", 61000);
//        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
//        Masina m3 = new Masina("Wv", "rosu", "benzina", 43000);
//        Masina m4 = new Masina("Mazda", "rosu", "benzina", 80000);
//
//        set.add(m1);
//        set.add(m2);
//        set.add(m3);
//        set.add(m4);
//        Node<Masina >it= set.iterator();
//        while (it!=null){
//            System.out.println(it.getData().toString());
//            it=it.getNext();
//        }
    //   }
    @Test

    public void getPosition(){

        SetImpl<Masina> set=new SetImpl();

        Masina m1 = new Masina("BMW", "rosu", "benzina", 61000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 43000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 80000);

       ListaImpl<Masina> lista=new ListaImpl<>();
       lista.add(m1);
       lista.add(m2);
       lista.add(m3);
       lista.add(m4);
        System.out.println( set.getPosition(m4));
    }

    @Test

    public void add(){

        SetImpl<Masina> set=new SetImpl();

        Masina m1 = new Masina("BMW", "rosu", "benzina", 61000);
        Masina m2 = new Masina("Audi", "rosu", "benzina", 5000);
        Masina m3 = new Masina("Wv", "rosu", "benzina", 43000);
        Masina m4 = new Masina("Mazda", "rosu", "benzina", 80000);

        SetImpl<Masina >setImpl=new SetImpl<>();
        setImpl.add(m1);
        setImpl.add(m2);
        setImpl.add(m3);
        setImpl.add(m4);

        Node<Masina> it = ((SetImpl<Masina>) setImpl).lista.iterator();

        while (it != null) {

            System.out.println(it.getData().toString());
            it = it.getNext();
        }

    }

}