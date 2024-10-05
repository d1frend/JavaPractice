package Labs.Laba_3;

import java.util.LinkedList;

public class HashTable<K, V> /*общая систему для всех типов данных*/ {
    private LinkedList<Element<K, V>>[] table;// int b, что из себя представляет таблица.
    private int countBucket = 5;
    private int countBucketMul2 = countBucket;
    private int countElement = 0;// кол-во элементов в таблице
    private LinkedList<K> arrKeys = new LinkedList<>();

    public HashTable() {
        table = new LinkedList[countBucket];//b = 5
    }

    public void put(K key, V value) {
        if (countBucket == countElement) {
            int countBucketMul2 = countBucket * 2;
            LinkedList<Element<K, V>>[] tableNew = new LinkedList[countBucketMul2];
            for (K i : arrKeys) {
                int index1 = hashMul2(i);
                if (tableNew[index1] == null) {
                    tableNew[index1] = new LinkedList<Element<K, V>>();
                }
                tableNew[index1].add(new Element<>(i, get(i)));
            }
            table = tableNew;
            countBucket = countBucketMul2;
        }
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<Element<K, V>>();
        }
        for (Element<K, V> i : table[index]) {
            if (i.getKey().equals(key)) {
                i.setValue(value);
                return;
            }
        }
        table[index].add(new Element<>(key, value));
        countElement++;
        arrKeys.add(key);
    }

    public V get(K key) {
        int index = hash(key);
        for (Element<K, V> i : table[index]) {
            if (i.getKey().equals(key)) {
                return i.getValue();
            }
        }
        return null;
    }

    public int size() {
        return countElement;
    }

    public boolean isEmpty() {
        return (countElement == 0);
    }

    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (int i = 0; i < table[index].size(); i++) {
                if (table[index].get(i).getKey().equals(key)) {
                    table[index].remove(i);
                    countElement--;
                    return;
                }
            }
        }
    }

    public int hash(K key) {
        int code = key.hashCode() % countBucket;
        return code < 0 ? code * -1 : code;
    }

    public int hashMul2(K key) {
        int code = key.hashCode() % countBucketMul2;
        return code < 0 ? code * -1 : code;
    }
}
