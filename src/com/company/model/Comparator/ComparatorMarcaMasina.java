package com.company.model.Comparator;

import com.company.model.Masina;

import java.util.Comparator;

public class ComparatorMarcaMasina implements Comparator<Masina> {

    @Override
    public int compare(Masina o1, Masina o2) {

            if(o1.getMarca().compareTo(o2.getMarca())>0){

                return  1;
            }else if(o1.getMarca().compareTo(o2.getMarca())<0)
                return -1;

            else return 0;
    }
}
