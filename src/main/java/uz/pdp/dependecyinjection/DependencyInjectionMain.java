package uz.pdp.dependecyinjection;

public class DependencyInjectionMain {
    public static void main(String[] args) {
        A a = new A(new B());
    }
}