package uz.pdp.xmlbasedconfig;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class C3Service {

    private final String action;

    public static C3Service getInstance() {
        return new C3Service("C3Service is created by getInstance()");
    }

    public void init(){
        System.out.println("[" + C3Service.class.getName() + "] init method called");
    }
    public void destroy(){
        System.out.println("[" + C3Service.class.getName() + "] destroy method called");
    }



}
