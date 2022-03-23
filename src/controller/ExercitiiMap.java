package controller;

import com.company.model.Masina;

import java.util.*;

public class ExercitiiMap {

    public void ex1() {

        Map<String, Masina> map = new HashMap<>();
        Masina masina1 = new Masina("Audi", "negru", "diesel", 6000);
        Masina masina2 = new Masina("Bmw", "rosu", "bezina", 3000);
        Masina masina3 = new Masina("Opel", "galben", "benzina", 4000);
        Masina masina4 = new Masina("Dacia", "rosu", "benzina", 3400);
        Masina masina5 = new Masina("Suzukie", "grii", "electric", 66000);
        map.put("Alex", masina1);
        map.put("Anca", masina2);
        map.put("Mihai", masina3);
        map.put("Andreea", masina4);
        map.put("Alin", masina5);
        //afisaare key

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
        }

        //afisare valori
        Collection<Masina> masini = map.values();

        Iterator<Masina> it2 = masini.iterator();
        while (it2.hasNext()) {
            Masina m = it2.next();
            System.out.println(m.toString());

        }

        //afisam perechile
        System.out.println("Perechi de key si valori");

        Set<Map.Entry<String, Masina>> mas = map.entrySet();
        Iterator<Map.Entry<String, Masina>> it3 = mas.iterator();
        while (it3.hasNext()) {
            Map.Entry<String, Masina> entry = it3.next();
            System.out.println(entry.toString());
        }

    }
//pune in ordine alfabetica
    public  void ex2_TreeMap(){
        Map<String,Masina> map=new TreeMap<>();
        Masina m1=new Masina("Bmw","negru","electric",9000);
        Masina m2=new Masina("Vw","grii","diesel",4990);
        Masina m3=new Masina("Mazda","alb","benzina",5000);
        Masina m4=new Masina("Opel","negru","benzina",5600);
        Masina m5=new Masina("Suzukie","rosu","electric",13000);
        map.put("Razvan",m4);
        map.put("Anca",m1);
        map.put("Alin",m2);
        map.put("Liviu",m5);
        map.put("Mihai",m3);



        //afsare key
        System.out.println("Afisare key\n");
        Set<String> keys=map.keySet();
        Iterator<String >it=keys.iterator();
        while (it.hasNext()){
            String key= it.next();
            System.out.println(key);
        }

        //afisare valori

        System.out.println("Afisarea valorilor\n");
        Collection<Masina> masini=map.values();
        Iterator<Masina>it2=masini.iterator();
        while(it2.hasNext()){
            Masina m= it2.next();
            System.out.println(m.toString());
        }


        //Afisare perechi
        System.out.println("afisare perechi\n");
        Set<Map.Entry<String,Masina>>mas=map.entrySet();
        Iterator<Map.Entry<String,Masina>>it3= mas.iterator();
        while(it3.hasNext()){
            Map.Entry<String,Masina>entry= it3.next();
            System.out.println(entry.toString());
        }

    }



    /*emptyMap()
Returns the empty map (immutable)*/
    public Map<String,Masina>empty(){
      return   Collections.emptyMap();

    }


    /*ceilingEntry(K key)
Returns a key-value mapping associated with the least key greater than or equal to the given key,
 or null if there is no such key.*/

    public  Map.Entry<String ,Map> ceilingEntry(){
        Map<String,Masina> map=new TreeMap<>();
        Masina m1=new Masina("Bmw","negru","electric",9000);
        Masina m2=new Masina("Vw","grii","diesel",4990);
        Masina m3=new Masina("Mazda","alb","benzina",5000);
        Masina m4=new Masina("Opel","negru","benzina",5600);
        Masina m5=new Masina("Suzukie","rosu","electric",13000);
        map.put("Razvan",m4);
        map.put("Anca",m1);
        map.put("Alin",m2);
        map.put("Liviu",m5);
        map.put("Mihai",m3);
       return ceilingEntry();
    }
}
