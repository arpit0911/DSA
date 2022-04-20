package oops.queue;

import java.util.ArrayList;

public class Queue {

    private ArrayList<Integer> data;
    private int size;
    int front;

    public Queue(){
        this.data =new ArrayList<>();
        this.front=0;
        this.size= 0;
    }

    public void add(int val){
        data.add(val);
        this.size++;
    }

    public int remove(){
        if(this.size==0) return -1;
        
        int ans= data.get(front);
        this.size--;
        front++;
        return ans;
    }

    public int peek(){
        if(this.size == 0) return -1;
        return data.get(front);
    }

    public int size(){
        return this.size;
    }




}
