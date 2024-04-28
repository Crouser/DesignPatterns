//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.HashMap;

public class MyHashMap<K, V> {

    public static int INTTIAL_SIZE = 1 << 4;
    public static int MAXIMUM_SIZE = 1 << 30;

    Entry[] hashtable;


    MyHashMap() {
        hashtable = new Entry[INTTIAL_SIZE];
    }

    MyHashMap(int capacity) {
        int tablesize = tableSizeFor(capacity);
        hashtable = new Entry[tablesize];
    }

    int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= (n >>> 1);
        n |= (n >>> 2);
        n |= (n >>> 3);
        n |= (n >>> 4);

        return (n < 0) ? 1 : (n >= MAXIMUM_SIZE) ? MAXIMUM_SIZE : n + 1;
    }

    class Entry<K, V> {
        K key;
        V value;
        Entry next;

        Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }

    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashtable.length;
        Entry node = hashtable[hashCode];

        if (node == null) {
            Entry newnode = new Entry(key, value);
            hashtable[hashCode] = newnode;
        } else {
            Entry previousnode = node;
            while (node != null) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                node = node.next;
                previousnode = node;
            }
            Entry newnode = new Entry(key, value);
            previousnode.next = newnode;

        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashtable.length;
        Entry node = hashtable[hashCode];

        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> hashMap = new MyHashMap<Integer, String>(10);
        hashMap.put(1, "Talha");
        hashMap.put(1, "gfjhxss");
        hashMap.put(2, "Amrit");
        hashMap.put(3, "Anonymous");

        System.out.println(hashMap.get(1));
    }
}