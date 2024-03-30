package uz.pdp.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class ADao { //Dao - Data Access Object
    public void accessData(){
        System.out.println("["+ADao.class.getName()+"] accessData() method is called");
    }
}
