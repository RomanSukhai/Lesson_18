package homework_02;

import java.util.*;

public class Map<M ,V extends MyEntry>{
     private List<M> f = new ArrayList();
     private List<V> d = new ArrayList();
    public Map() {
    }

    public List<M> getF() {
        return f;
    }

    public void setF(List<M> f) {
        this.f = f;
    }

    public List<V> getD() {
        return d;
    }

    public void setD(List<V> d) {
        this.d = d;
    }
    public  void add(Integer d ,MyEntry s){
        if (getF().size() == 0){
            getF().add((M) d);
            getD().add((V) s);

        }else {
            boolean flag = false;
            for (int i = 0; i<f.size();i++){
                if (d != f.get(i)){
                    flag = true;
                }
            }

            if (flag){
                getF().add((M) d);
                getD().add((V) s);
            }else {
                System.out.println("Plrase print new key");
        }

        }
    }
    public  void removeValue(String r){
        for (V q : d ){
            if (q.getM() == r){
                d.remove(q);
            }
        }
    }

    public  void printAllKey(){
        for (M q : f){
            System.out.println(q);
        }
    }
    public  void printAllObject(){
        for (V q : d){
            System.out.println(d);
        }
    }
    public void printAll(){
        for (M q : f){
            for (V w : d){
                System.out.println("Key="+q +" Object="+w+" Him key="+w.getM()+" Him values="+w.getV());
            }

        }
    }
    @Override
    public String toString() {
        return "Map{" +
                "f=" + f +
                ", d=" + d +
                '}';
    }
    };
