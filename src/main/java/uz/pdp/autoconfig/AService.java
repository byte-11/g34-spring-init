package uz.pdp.autoconfig;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class AService implements AutoConfigBasedService{

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

    @PostConstruct
    public void init(){
        System.out.println("[" + AService.class.getName() + "] init method called");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("[" + AService.class.getName() + "] destroy method called");
    }

}
