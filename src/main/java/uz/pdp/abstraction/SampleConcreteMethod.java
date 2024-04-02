package uz.pdp.abstraction;

public interface SampleConcreteMethod {
    default int add(Integer a, int b) {
        if(a > b) {
            for (int i = 0; i < 1_000_000; i++) {
                System.out.println("Voy dod, miyya qiziyapti!!!");
            }
        }
        return a + b;
    }
    default Object clone(){
        return null;
    };
}
