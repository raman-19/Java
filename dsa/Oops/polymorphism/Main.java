package raman.Oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
//        Square square = new Square();
        Shapes square = new Square();

        shapes.area();
    }
}


//we can not override static method .static method can be inherited.overriding depend on objects,
//static can not depend on object .hence, static object can not be override.