package raman.Oops.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.normal();
        Daughter daughter = new Daughter(40);
        daughter.career();

        Parent.hello();

    }
}
