package com.company.model;

public class Animal implements Comparable<Animal> {
    private String nume;
    private String culoare;
    private boolean carnivour;
    private int varsta;

    public  Animal(String nume,String culoare,boolean carnivour,int varsta){
        this.nume=nume;
        this.culoare=culoare;
        this.carnivour=carnivour;
        this.varsta=varsta;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isCarnivour() {
        return carnivour;
    }

    public void setCarnivour(boolean carnivour) {
        this.carnivour = carnivour;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString(){
        String text="";
        text+=nume+","+culoare+","+carnivour+","+varsta;
        return  text;
    }

    @Override
    public boolean equals(Object obj){
        Animal animal=(Animal)obj;
        return animal.varsta==this.varsta;
    }
    @Override
    public int compareTo(Animal animal) {
        if(this.varsta>animal.varsta){
            return  1;
        }else if(this.varsta< animal.varsta)
            return -1;

        return 0;
    }
}
