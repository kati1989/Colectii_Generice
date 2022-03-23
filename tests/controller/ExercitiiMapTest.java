package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercitiiMapTest {
    private ExercitiiMap exercitiiMap;

    @BeforeEach
    public  void  preconditie(){
        exercitiiMap=new ExercitiiMap();
    }
    @Test
    public  void ex1(){
        exercitiiMap.ex1();

    }

    @Test
    public  void empty(){
        System.out.println(exercitiiMap.empty());
    }

    @Test
    public  void ex2(){
        exercitiiMap.ex2_TreeMap();
    }

    @Test
    public  void ceiling(){
        exercitiiMap.ceilingEntry();
    }

}