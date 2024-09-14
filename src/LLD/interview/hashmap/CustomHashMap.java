package src.LLD.interview.hashmap;

import src.LLD.interview.stackoverflow.tag.Tag;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CustomHashMap <K, V>{
    private static int INITIAL_CAPACITY = 1<<4;
    private static int MAX_CAPACITY = 1<<30;
    private static float LOAD_FACTOR = 0.75f;
    private int size;
    private Entry<K, V>[] entries;
    private int capacity;

    public CustomHashMap() {
        capacity = INITIAL_CAPACITY;
        entries = new Entry[INITIAL_CAPACITY];
    }

    public CustomHashMap(int capacity){
        if(capacity>MAX_CAPACITY){
            throw new IllegalArgumentException("Maximum capacity reached");
        }
        this.capacity = nearestMaxCapacity(capacity);
        entries = new Entry[this.capacity];
    }

    public int nearestMaxCapacity(int capacity){
        return (int)Math.pow(2, Math.ceil(Math.log(capacity)/Math.log(2)));
    }

    public void put(K key, V value){
        size++;
        if(size>LOAD_FACTOR*capacity){
            resize();
        }
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode%capacity); //handle negative keys
        Entry<K, V> temp = entries[index];
        Entry<K, V> currentEntry = new Entry<>(key, value);
        if(temp==null){
            entries[index] = currentEntry;
            return;
        }
        while(temp.getNext()!=null){
            if(temp.getKey().equals(key)){
                temp.setValue(value);
                return;
            }
            temp = temp.getNext();
        }
        temp.setNext(currentEntry);
        System.out.println(entries[index]);
    }

    public void resize(){
        size=0;
        System.out.println("resizing");
        Entry<K, V>[] oldEntries = entries;
        capacity = capacity*2;
        entries = new Entry[capacity];
        for(int i = 0; i<oldEntries.length; i++){
            Entry<K, V> temp = oldEntries[i];
            while(temp!=null){
                put(temp.getKey(), temp.getValue());
                temp = temp.getNext();
            }
        }
    }

    public V get(K key){
        int hashCode = key.hashCode();
        int index = hashCode%capacity;
        Entry<K, V> temp = entries[index];
        while(temp!=null){
            if(temp.getKey().equals(key)){
                return temp.getValue();
            }
            temp = temp.getNext();
        }
        throw new NoSuchElementException("Key not found");
    }

    public ArrayList<K> keys(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i = 0; i<capacity; i++){
            Entry<K, V> temp = entries[i];
            while(temp!=null){
                keys.add(temp.getKey());
                temp = temp.getNext();
            }
        }
        return keys;
    }

    public ArrayList<V> values(){
        ArrayList<V> values = new ArrayList<>();
        for(int i = 0; i<capacity; i++){
            Entry<K, V> temp = entries[i];
            while(temp!=null){
                values.add(temp.getValue());
                temp = temp.getNext();
            }
        }
        return values;
    }

    public Entry<K, V>[] getEntries() {
        return entries;
    }
}
