package com.company.model;

public class Masina implements Comparable<Masina>{
  private String marca;
  private String culoare;
  private String tip;
  private int pret;


    public Masina(String marca,      String culoare, String tip, int pret) {
        this.marca = marca;
        this.culoare = culoare;
        this.tip = tip;
        this.pret = pret;
    }

    public  Masina(String proprietati){
        this.marca=proprietati.split(",")[0];
        this.culoare=proprietati.split(",")[1];
        this.tip=proprietati.split(",")[2];
        this.pret=Integer.parseInt(proprietati.split(",")[3]);
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }


    @Override
    public String toString(){
        String desc="";
        desc+="\nMarca: "+marca+"\nCuloare: "+culoare+"\nTip:"+tip+"\nPret: "+pret;
        return desc;
    }
    public String toSave(){
        String desc="";
        desc+=marca+", "+culoare+","+tip+", "+pret;
        return desc;
    }



    @Override
    public int compareTo(Masina b) {


        if(this.pret>b.pret){
            return  1;
        }else if(this.pret<b.pret){
            return -1;
        }
        return 0;
    }

    @Override
    public  boolean equals(Object obj){
      Masina masina=(Masina)obj;
      return  masina.pret==this.pret;
    }


}
