package raman.Oops.AbstractClass;

public class Son extends Parent {

    public Son(int age){
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    void career(){
        System.out.println("I am going to be a  coder" );
    }
    void partner(){
        System.out.println("I love rk");
    }
}
