package raman.Oops.AbstractClass;

public abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }
//    abstract Parent()  we can not create abstract constructor

    static void hello(){
        System.out.println("hiii");
    }

//    normal method
    void normal(){
        System.out.println("hey this is normal");
    }
    abstract void career();

    abstract void partner();
}
