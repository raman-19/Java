package raman.Oops.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {
    private int[]data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public customArrayList(){
        this.data = new int [DEFAULT_SIZE];

    }


    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int []temp = new int[data.length*2];

        for(int i=0 ;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
         data[index] = value;

    }
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
        customArrayList ans = new customArrayList();
//        ans.add(3);
//        ans.add(5);
//        ans.add(9);

        for(int i=0;i<14;i++){
            ans.add(2*i);
        }
        System.out.println(ans);

    }
}
