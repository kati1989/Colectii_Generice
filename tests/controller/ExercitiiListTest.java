package controller;

import com.company.model.Comparator.ComparatorMarcaMasina;
import com.company.model.Masina;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ExercitiiListTest {
    private ExercitiiList controller;

    @BeforeEach
    public void preconditie() {
        controller = new ExercitiiList();

    }


    @Test
    public void afiseaza() {

        controller.afiseaza();
    }

    @Test
    public void sterge() {


        Masina m = new Masina("Vw,negru,electric,4000");
        controller.sterge(m);
        controller.afiseaza();

    }

    @Test
    public void isMasina() {


        assertEquals(true, controller.isMasina("Mazda"));
    }

    @Test
    public void add() {

        Masina m = new Masina("Dacia,negru,benzina,2300");
        controller.add(m);
        assertEquals(true, controller.isMasina("Dacia"));
    }

    @Test
    public void toSave() {


        Masina m = new Masina("Dacia,negru,benzina,2300");
        controller.add(m);
        controller.toSave();
        controller.afiseaza();

    }

    @Test
    public void saveFisier() {

        Masina m = new Masina("Dacia,negru,benzina,2600");
        controller.add(m);
        controller.saveFisier();
        controller.afiseaza();


    }

    @Test

    public void binarySearch() {
        Masina masina = new Masina("Mazda,negru,benzina,5000");

        System.out.println(controller.binarySearch(masina));
    }

    @Test

    public void addall() {

        Masina m1 = new Masina("Bmw", "galben", "electric", 9000);
        Masina m2 = new Masina("Porsche", "rosu", "benzina", 120000);
        Masina m3 = new Masina("Suzukie", "albastru", "diesel", 4500);
        controller.addall(m1, m2, m3);
        controller.afiseaza();
    }

    @Test

    public void noCommonElements() {

        List<Masina> masini1 = new ArrayList<>();

        List<Masina> masini2 = new ArrayList<>();
        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);

        Masina m6 = new Masina("Audi", "maro", "electric", 9900);
        Masina m7 = new Masina("Merzedes", "roz", "benzina", 78900);
        Masina m8 = new Masina("Suzuki", "alb", "diesel", 2000);
        Masina m9 = new Masina("Opel", "albastru", "benzina", 4500);
        Masina m10 = new Masina("Bmw", "metalizat", "electric", 67880);

        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);

        masini2.add(m6);
        masini2.add(m7);
        masini2.add(m8);
        masini2.add(m9);
        masini2.add(m10);
        System.out.println(controller.noCommonElements(masini1, masini2));

    }

    @Test

    public void copyInNew() {

        controller.copyInNewList();

    }


    @Test

    public void emptyList() {

        List<Masina> masini1 = new ArrayList<>();

        List<Masina> masini2 = new ArrayList<>();
        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);

        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);
        System.out.println(controller.emptyList());

    }

    @Test
    public void fill() {
        List<Masina> masini1 = new ArrayList<>();
        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);

        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);

        controller.fill(masini1, m5);
        Iterator<Masina> it = masini1.iterator();

        while (it.hasNext()) {
            Masina m = it.next();
            System.out.println(m.toString());
        }

    }


    @Test
    public void frequency() {
        List<Masina> masini1 = new ArrayList<>();
        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);

        masini1.add(m1);
        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        System.out.println(controller.frequency(masini1, m1));
        Iterator<Masina> it = masini1.iterator();
        while (it.hasNext()) {
            Masina m = it.next();
            System.out.println(m.toString());
        }


    }

    //lista a doua la ce pozitie se regaseste in lista 2
    @Test
    public void indexOfList() {

        List<Masina> masini1 = new ArrayList<>();

        List<Masina> masini2 = new ArrayList<>();
        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);

        Masina m6 = new Masina("Audi", "maro", "electric", 9900);
        Masina m7 = new Masina("Merzedes", "roz", "benzina", 78900);
        Masina m8 = new Masina("Suzuki", "alb", "diesel", 2000);
        Masina m9 = new Masina("Opel", "albastru", "benzina", 4500);
        Masina m10 = new Masina("Bmw", "metalizat", "electric", 67880);

        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);

//        masini2.add(m1);
//        masini2.add(m2);
        masini2.add(m3);
        masini2.add(m4);
        masini2.add(m5);
        System.out.println(controller.indexofList(masini1, masini2));

    }

    @Test
    public void lastindexof() {

        List<Masina> masini1 = new ArrayList<>();

        List<Masina> masini2 = new ArrayList<>();
        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);

        Masina m6 = new Masina("Audi", "maro", "electric", 9900);
        Masina m7 = new Masina("Merzedes", "roz", "benzina", 78900);
        Masina m8 = new Masina("Suzuki", "alb", "diesel", 2000);
        Masina m9 = new Masina("Opel", "albastru", "benzina", 4500);
        Masina m10 = new Masina("Bmw", "metalizat", "electric", 67880);

        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);
        masini1.add(m6);
        masini1.add(m7);
        masini1.add(m8);
        masini1.add(m9);
        masini1.add(m10);
//
//        masini2.add(m1);
//        masini2.add(m2);
//        masini2.add(m3);
//        masini2.add(m4);
//        masini2.add(m5);
        masini2.add(m6);
        masini2.add(m7);
        masini2.add(m8);
        masini2.add(m9);
        masini2.add(m10);

        System.out.println(controller.lastInxOf(masini1, masini2));

    }

    @Test

    public void max() {

        List<Masina> masini1 = new ArrayList<>();

        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);

        Masina m6 = new Masina("Audi", "maro", "electric", 9900);
        Masina m7 = new Masina("Merzedes", "roz", "benzina", 78900);
        Masina m8 = new Masina("Suzuki", "alb", "diesel", 2000);
        Masina m9 = new Masina("Opel", "albastru", "benzina", 4500);
        Masina m10 = new Masina("Bmw", "metalizat", "electric", 67880);

        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);

        System.out.println(controller.max(masini1));

    }

    @Test

    public void max2() {

        List<Masina> masini1 = new ArrayList<>();

        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);


        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);
        ComparatorMarcaMasina comparatorMarcaMasina = new ComparatorMarcaMasina();
        System.out.println(controller.max2(masini1, comparatorMarcaMasina));

    }


    @Test

    public void min() {

        List<Masina> masini1 = new ArrayList<>();

        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);


        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);
        ComparatorMarcaMasina comparatorMarcaMasina = new ComparatorMarcaMasina();
        System.out.println(controller.min(masini1));

    }


    @Test

    public void min2() {

        List<Masina> masini1 = new ArrayList<>();

        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);


        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);
        ComparatorMarcaMasina comparatorMarcaMasina = new ComparatorMarcaMasina();
        System.out.println(controller.min2(masini1, comparatorMarcaMasina));

    }

    @Test

    public void reverse() {

        List<Masina> masini1 = new ArrayList<>();

        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);


        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);
        controller.reverse(masini1);
        Iterator<Masina> it = masini1.iterator();
        while (it.hasNext()) {
            Masina m = it.next();
            System.out.println(m.toString());
        }
    }

    @Test
    public void shuffle() {

        List<Masina> masini1 = new ArrayList<>();

        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);


        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);
        controller.shuffle(masini1);
        Iterator<Masina> it = masini1.iterator();
        while (it.hasNext()) {
            Masina m = it.next();
            System.out.println(m.toString());
        }

    }

    @Test
    public void singleton() {

        List<Masina> masini1 = new ArrayList<>();

        Masina m1 = new Masina("Suzuki", "albastru", "benzina", 3000);
        Masina m2 = new Masina("Bmw", "alb", "diesel", 4000);
        Masina m3 = new Masina("Opel", "grii", "benzina", 9000);
        Masina m4 = new Masina("Porsche", "negru", "electric", 1200);
        Masina m5 = new Masina("Vw", "bej", "diesel", 3000);


        masini1.add(m1);
        masini1.add(m1);
        masini1.add(m2);
        masini1.add(m3);
        masini1.add(m4);
        masini1.add(m5);


    }


}