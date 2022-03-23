package com.company.implementate;

public class SetImpl<T extends Comparable<T>> {

    public Lista<T> lista;
   public SetImpl(){
       lista=new ListaImpl<>();
   }

   // compare to pana gasim mai mare ca el
   public void add(T data){
        int position=getPosition(data);
       Node<T> it= lista.iterator();

        if(position!=0){
            int i=0;
            while (i<position-1) it=it.getNext();
            Node<T> node = new Node<T>();
            node.setData(data);
            node.setNext(it.getNext());
             it.setNext(node);
        } else {
             it= lista.iterator();
             if (it==null){
                 Node<T>node=new Node<>();
                 lista.add(data);
             } else {
                 while (it != null && it.getData().compareTo(data) < 0) {
                     it = it.getNext();
                 }
                 Node<T> node = new Node<>();
                 node.setData(data);
                 if (it!=null) {
                     node.setNext(it.getNext());
                     it.setNext(node);
                 }
             }
        }

    }


   public int getPosition(T obj){
       int poz=0;
      Node<T> it= lista.iterator();
      while(it!=null){
          if(it.getData().compareTo(obj)<0){
              return poz;
          }
          poz++;
          it=it.getNext();

      }
      return  0;
   }
}
