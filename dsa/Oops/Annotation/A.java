package raman.Oops.Annotation;

public interface A {
//    static interface should always have a body
//    call via the interface name
    static void greeting(){
        System.out.println("Hey i am static method");
    }

    default void fun(){
        System.out.println("I am in A");
    }
}
