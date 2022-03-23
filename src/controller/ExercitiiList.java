package controller;

import com.company.model.Comparator.ComparatorMarcaMasina;
import com.company.model.Masina;
import com.company.model.Persoana;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class ExercitiiList {
    private List<Masina> list;

    public ExercitiiList() {
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

    public void afiseaza() {
        Iterator<Masina> it = list.iterator();
        while (it.hasNext()) {
            Masina m = it.next();
            System.out.println(m);
        }

    }

    public void sterge(Masina m) {
        Iterator<Masina> it = list.iterator();
        while (it.hasNext()) {
            Masina t = it.next();
            if (t.equals(m)) {
                it.remove();
            }
        }
    }

    public boolean isMasina(String marca) {
        Iterator<Masina> it = list.iterator();
        while (it.hasNext()) {
            Masina m = it.next();
            if (m.getMarca().equals(marca)) {
                return true;
            }
        }
        return false;
    }

    public void add(Masina masina) {
        list.add(masina);

    }

    public String toSave() {
        String text = "";
        Iterator<Masina> it = list.iterator();
        while (it.hasNext()) {
            Masina m = it.next();
            text += m.toSave() + "\n";
        }
        return text;
    }

    public void saveFisier() {
        File file = new File("C:\\Users\\Kati\\Desktop\\Java_curs\\OOP\\Colectii_Generice\\src\\com\\company\\input.txt");
        try {
            FileWriter w = new FileWriter(file);
            PrintWriter p = new PrintWriter(w);
            p.print(this.toSave());
            p.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // binarySearch(List<? extends Comparable<? super T>> list, T key)
    public int binarySearch(Masina masina) {
        Collections.sort(list, new ComparatorMarcaMasina());
        return Collections.binarySearch(list, masina, new ComparatorMarcaMasina());
    }

    // addAll(Collection<? super T> c, T... elements

    public void addall(Masina m1, Masina m2, Masina m3) {

        Collections.addAll(list, m1, m2, m3);
    }

    //copy(List<? super T> dest, List<? extends T> src)

    public void copyInNewList() {

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
        List<Masina> src = new ArrayList<>();

        List<Masina> dest = new ArrayList<>();

        src.add(m1);
        src.add(m2);
        src.add(m3);
        src.add(m4);
        src.add(m5);

        dest.add(m6);
        dest.add(m7);
        dest.add(m8);
        dest.add(m9);
        dest.add(m10);


        Collections.copy(dest, src);


        Iterator<Masina> it = dest.iterator();
        while (it.hasNext()) {
            Masina m = it.next();
            System.out.println(m.toString());
        }


    }

    /*isjoint(Collection<?> c1, Collection<?> c2)
Returns true if the two specified collections have no elements in common.*/
    public boolean noCommonElements(List<Masina> masini1, List<Masina> masini2) {


        return Collections.disjoint(masini1, masini2);


    }


    /*emptyList()
Returns the empty list (immutable).*/
    public List<Masina> emptyList() {
        return Collections.emptyList();

    }


    /* 	fill(List<? super T> list, T obj)
    Replaces all of the elements of the specified list with the specified elemen*/
    public void fill(List<Masina> masini, Masina masina) {
        Collections.fill(masini, masina);
    }

       /*frequency(Collection<?> c, Object o)
Returns the number of elements in the specified collection equal to the specified object*/

    public int frequency(List<Masina> masini, Masina masina) {
        return Collections.frequency(masini, masina);

    }

       /*indexOfSubList(List<?> source, List<?> target)
Returns the starting position of the first occurrence of the specified target list within the specified source list,
or -1 if there is no such occurrence*/

    public int indexofList(List<Masina> masini1, List<Masina> masini2) {

        return Collections.indexOfSubList(masini1, masini2);
    }

    /*lastIndexOfSubList(List<?> source, List<?> target)
Returns the starting position of the last occurrence of the specified target list within the specified source list,
or -1 if there is no such occurrence*/

    public int lastInxOf(List<Masina> masini1, List<Masina> masini2) {
        return Collections.lastIndexOfSubList(masini1, masini2);
    }

    /*max(Collection<? extends T> coll)
Returns the maximum element of the given collection, according to the natural ordering of its elements*/

    public Masina max(List<Masina> masini) {
        return Collections.max(masini);
    }

    /* 	max(Collection<? extends T> coll, Comparator<? super T> comp)
Returns the maximum element of the given collection, according to the order induced by the specified comparator*/


    public Masina max2(List<Masina> masini, ComparatorMarcaMasina comparatorMarcaMasina) {
        return Collections.max(masini, comparatorMarcaMasina);
    }

    /*min(Collection<? extends T> coll)
Returns the minimum element of the given collection, according to the natural ordering of its elements*/

    public Masina min(List<Masina> masini) {
        return Collections.min(masini);
    }

    /* 	min(Collection<? extends T> coll, Comparator<? super T> comp)
Returns the minimum element of the given collection, according to the order induced by the specified comparator*/

    public Masina min2(List<Masina> masini, ComparatorMarcaMasina comparatorMarcaMasina) {
        return Collections.min(masini, comparatorMarcaMasina);
    }

    /* 	reverse(List<?> list)
Reverses the order of the elements in the specified list.*/

    public  void reverse(List<Masina>masini){
        Collections.reverse(masini);
    }

    /*shuffle(List<?> list)
Randomly permutes the specified list using a default source of randomness*/

    public  void shuffle(List<Masina >masini){
        Collections.shuffle(masini);

    }

    /* 	sort(List<T> list)
Sorts the specified list into ascending order, according to the natural ordering of its elements*/

    public void exSort() {

        Collections.sort(list);

        afiseaza();
    }

/*sort(List<T> list, Comparator<? super T> c)
Sorts the specified list according to the order induced by the specified comparator*/
    public void exSort2Masina() {

        //sort(List<T> list, Comparator<? super T> c)
        Collections.sort(list, new ComparatorMarcaMasina());
        afiseaza();

    }

    /*swap(List<?> list, int i, int j)
Swaps the elements at the specified positions in the specified list*/
    public void exSwap(){
        Collections.swap(list,1,2);

    }






}

