package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercitiiSetTest {
    private  ExercitiiSet exercitiiSet;

    @BeforeEach
    public  void preconditie(){
        exercitiiSet=new ExercitiiSet();

    }

    @Test
    public void ex1(){
     exercitiiSet.exSet();
    }


    @Test
    public void ex2(){
        exercitiiSet.exSet();
    }
    @Test
    public  void lower(){
        exercitiiSet.treeSet();
    }
}