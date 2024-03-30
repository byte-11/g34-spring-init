package uz.pdp.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class AService {

    private final ADao aDao;
//    @Autowired
//    private ADao aDao;

    public AService(ADao aDao ) {
        this.aDao = aDao;
    }

    public void serve(){
        System.out.println("[" + AService.class.getName() + "] serve() method called");
        aDao.accessData();
    }

    /*@Autowired
    public void setaDao(ADao aDao) {
        this.aDao = aDao;
    }*/
}
