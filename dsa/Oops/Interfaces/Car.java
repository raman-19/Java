package raman.Oops.Interfaces;

public class Car implements  Engin,Brake{

    public void brake(){
        System.out.println("I brake like a normal car");
    }
    public void start(){
        System.out.println("I start like a normal car");
    }
    public void stop(){
        System.out.println("i stop like a normal car");
    }
    public void acc(){
        System.out.println("I accelerate like a normal car");
    }
}
