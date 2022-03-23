package com.company.model;

public class Persoana implements Comparable<Persoana> {
    private int id;
    private String nume;
    private int varsta;
    private String adresa;

    public  Persoana(int id,String nume,int varsta,String adresa){
        this.id=id;
        this.nume=nume;
        this.varsta=varsta;
        this.adresa=adresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public  String toString(){
        String text="";
        text+=id+","+nume+","+varsta+","+adresa;
        return  text;
    }

    @Override
    public int compareTo(Persoana p) {
        if(this.varsta>p.varsta){
            return 1;
        }else if(this.varsta<p.varsta){
            return -1;
        }
        return 0;
    }

    @Override
    public  boolean equals(Object obj){
        Persoana persoana=(Persoana) obj;
        return persoana.varsta==this.varsta;

    }
}
