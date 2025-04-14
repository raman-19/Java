package raman.Oops.AccessControl;

public class A {
    private  int num ;
    String name;
    int[]arr;

    public int getNum(){
        return num;
    }
    public int setNum(int num){
        return this.num = num;
    }

    public A(int num,String name){
        this.num=num;
        this.name = name;
        this.arr= new int [34];
    }



}
