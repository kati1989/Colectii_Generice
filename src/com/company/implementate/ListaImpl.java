package com.company.implementate;

public class ListaImpl<T> implements Lista<T> {

    public Node<T> head = null;

    @Override
    public Node<T> iterator() {
        return head;
    }


    @Override
    public void add(T obj) {
        if (head == null) {
            head = new Node<T>();
            head.setNext(null);
            head.setData(obj);
        } else {
            Node<T> it = iterator();
            while (it.getNext() != null) {
                it = it.getNext();
            }
            Node<T> nou = new Node<>();
            nou.setData(obj);
            nou.setNext(null);
            it.setNext(nou);


        }
    }

    public void addPeOPoz(T obj,int index){
        int p=0;
        if(head ==null){
            head=new Node<>();
            head.setNext(null);
            head.setData(obj);
        }else{
            Node<T>it=iterator();
            while(it!=null){
                if(p==(index-1)){
                    Node<T>nou=new Node<>();
                    nou.setData(obj);
                    nou.setNext(it.getNext());
                    it.setNext(nou);
                }
                p++;
                it=it.getNext();

            }
        }
    }


//    public  removeFirst removeLast removePoz

    @Override
    public void removeFirst() {
        head = head.getNext();
    }

    @Override
    public void removeLast() {
        Node<T> it = iterator();
        while (it.getNext().getNext() != null) {
            it = it.getNext();
        }
        it.setNext(null);

    }


    @Override
    public void removePoz(int poz) {
        int contor = 0;
        Node<T> it = iterator();
        while (it != null && contor != poz - 1) {
            it = it.getNext();
            contor++;

        }

        if (it != null)
            it.setNext(it.getNext().getNext());


    }

    @Override
    public void remove(int poz) {


        if (poz == 0) {

            removeFirst();
        }
        ;
        if (poz < size() - 1) {

            removePoz(poz);
        } else {

            removeLast();
        }

    }


    @Override
    public boolean contains(T data) {
        Node<T> it = iterator();
        while (it != null) {
            if (it.getData().equals(data)) {
                return true;
            }
            it = it.getNext();
        }
        return false;
    }


    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else
            return false;
    }

    @Override
    public int size() {
        int contor = 0;
        Node<T> it = iterator();
        while (it != null) {
            contor++;
            it = it.getNext();
        }
        return contor;
    }


    public void addStart(T obj) {


        if (head == null) {

            head = new Node<>();
            head.setData(obj);
            head.setNext(null);
        } else {

            Node<T> x = new Node<>();
            x.setNext(head);
            x.setData(obj);

            head = x;
        }


    }



    @Override
    public void removeObj(T data) {

        int index = indexOf(data);

        if (index != -1) {

            remove(index);
        }
    }

    public int indexOf(T obj) {
        int poz = 0;
        Node<T> it = iterator();
        while (it != null) {
            if (it.getData() == obj) {
                return poz;
            }
            poz++;
            it = it.getNext();
        }
        return -1;
    }

    public T getObjIndex(int index) {
        int poz = 0;
        Node<T> it = iterator();
        while (it != null) {
            if (poz == index) {
                return it.getData();
            }
            poz++;
            it = it.getNext();

        }
        return null;

    }

    public T getObj() {

        return iterator().getData();
    }

    public void setObj(T obj, int index) {
        int poz = 0;
        Node<T> it = iterator();
        while (it != null) {
            if(poz==index){
                it.setData(obj);
            }
            poz++;
            it=it.getNext();

        }
    }


}


