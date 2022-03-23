package com.company.model.Comparator;

import com.company.model.Animal;

import java.util.Comparator;

public class ComparatorNumeAnimal implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {

        if(o1.getNume().compareTo(o2.getNume())>0)
        {
            return 1;
        }
        else if(o1.getNume().compareTo(o2.getNume())<0){
            return -1;
        }
        else

        return 0;
    }
}
