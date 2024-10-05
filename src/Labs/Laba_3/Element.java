package Labs.Laba_3;

public class Element <K, V>{
    private final K key;// final - не будет меняться (константа)
    private V value;

    public Element(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey(){
        return key;
    }


}
