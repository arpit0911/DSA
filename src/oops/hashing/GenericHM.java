package oops.hashing;

import java.util.LinkedList;

public class GenericHM<K, V> {

    class GenericNode {
        K key;
        V value;

        public GenericNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<GenericNode>[] bucket;
    private int size;

    public GenericHM() {
        initialize(4);
        this.size = 0;
    }

    private void initialize(int cap) {
        this.bucket= new LinkedList[cap];
        for(int i=0; i<cap ;i++){
            this.bucket[i]= new LinkedList<>();
        }
    }

    public void put(K key, V val){
        int bi= getBucketIndex(key);
        for (GenericNode node : bucket[bi]) {
            if(node.key.equals(key)){
                node.value=val;
                return;
            }
        }
        GenericNode node=new GenericNode(key, val);
        bucket[bi].addLast(node);
        this.size++;

        if(getLambda() <= 2.0) return;
        reHashing();
        
    }


    public V get(K key){
        int bi= getBucketIndex(key);
        for (GenericNode node : bucket[bi]) {
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key){
        int bi=getBucketIndex(key);
        for (GenericNode node : bucket[bi]) {
            if(node.key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public V remove(K key){
        int bi=getBucketIndex(key);
        for (GenericNode node : bucket[bi]) {
            if(node.key.equals(key)){
                V ans= node.value;
                bucket[bi].remove(node);
                this.size--;
                return ans;
            }
        }
        return null;
    }

    private void reHashing() {
        LinkedList<GenericNode>[] old= this.bucket;
        initialize(this.bucket.length*2);

        for (LinkedList<GenericNode> ll : old) {
            for (GenericNode node : ll) {
                put(node.key, node.value);
            }
            
        }
    }
    public void display(){
        for (LinkedList<GenericNode> ll : this.bucket) {
            for (GenericNode node : ll) {
                System.out.println(node.key+ " = "+ node.value);
            }
        }
    }


    private double getLambda() {
        return this.size * (1.0 / bucket.length);
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % bucket.length);
    }

}
