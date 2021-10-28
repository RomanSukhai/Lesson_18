package homework_02;

import java.util.*;

public class Map{

    MyEntry[] a = new MyEntry[100];

    public <a> Map() {
        this.a = a;
    }

    public MyEntry[] getA() {
        return a;
    }

    public void setA(MyEntry[] a) {
        this.a = a;
    }

    public  void add(MyEntry b){
        for (int i = 0 ; i<a.length;i++){
            if (a[i]== null){
                a[i]= b;
                return;
            }
        }
    }
    public  void removeKey(Number r){
        ArrayList<MyEntry> list = new ArrayList<>();
        for (MyEntry f : a){
            if (f != null){
                list.add(f);
            }
        }
        int l = 0;
        while (l<100){
            for (int i =0 ; i<list.size();i++){
                if (list.get(i).getV() == r) {
                    list.remove(list.get(i));
                }
            }
            l++;
        }
            MyEntry[] s = new MyEntry[100];
        for (int i = 0 ; i<list.size();i++){
            if (s[i]==null){
                s[i] = list.get(i);
            }

        }
        a=s;
    }
    public  void removeValue(String r){
        ArrayList<MyEntry> list = new ArrayList<>();
        for (MyEntry f : a){
            if (f != null){
                list.add(f);
            }
        }
        int l = 0;
        while (l<100){
            for (int i =0 ; i<list.size();i++){
                if (list.get(i).getM() == r) {
                    list.remove(list.get(i));
                }
            }
            l++;
        }
        MyEntry[] s = new MyEntry[100];
        for (int i = 0 ; i<list.size();i++){
            if (s[i]==null){
                s[i] = list.get(i);

            }
        }
        a=s;
    }
    public  void printAllKey(){
        System.out.println(".....................");
        for (int i = 0 ; i<a.length;i++){
            if (a[i] != null){
                System.out.println("--->{"+a[i].getV()+"}Index: "+a[i].getV().hashCode());
            }
        }
        System.out.println(".....................");
    }
    public  void printAllValue(){
        System.out.println(".....................");
        for (int i = 0 ; i<a.length;i++){
            if (a[i] != null){
                System.out.println("--->{"+a[i].getM()+"}HashCode: "+a[i].getM().hashCode());
            }
        }
        System.out.println(".....................");
    }
    public  void printAll(){
        System.out.println(".....................");
        for (int i = 0 ; i<a.length;i++)
            if (a[i] != null){
                System.out.println("--->"+a[i].toString());
            }
        System.out.println(".....................");
    }
    };
