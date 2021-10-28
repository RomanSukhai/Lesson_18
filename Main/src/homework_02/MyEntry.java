package homework_02;

public class MyEntry <V,M>{
    V v ;
    M m ;

    public MyEntry(V v, M m) {
        this.v = v;
        this.m = m;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "v=" + v +
                ", m=" + m +
                '}';
    }
}
