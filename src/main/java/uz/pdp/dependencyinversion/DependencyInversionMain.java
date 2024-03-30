package uz.pdp.dependencyinversion;

public class DependencyInversionMain {
    public static void main(String[] args) {
        Computer computer = new Computer(new IntelCore());
        Computer computer1 = new Computer(new M1());
    }
}
