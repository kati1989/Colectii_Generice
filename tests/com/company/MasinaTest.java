package com.company;

import com.company.model.Masina;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MasinaTest {

    @Test
    void compareTo() {
        Masina masina1=new Masina("Audi","rosu","benzina",4000);
        Masina masina2=new Masina("Mazda","albastru","electric",7000);
        assertEquals(-1,masina1.compareTo(masina2));
    }
}