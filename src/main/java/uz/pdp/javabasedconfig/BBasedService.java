package uz.pdp.javabasedconfig;

public class BBasedService implements JavaBasedService {

    private final BDao bDao;

    public BBasedService(BDao bDao) {
        this.bDao = bDao;
    }

    public void serve() {
        System.out.println("[" + BBasedService.class.getName() + "] serve() method called");
        bDao.accessData();
    }

    public void init(){
        System.out.println("[" + BBasedService.class.getName() + "] init method called");
        bDao.accessData();
    }
    public void destroy(){
        System.out.println("[" + BBasedService.class.getName() + "] destroy method called");
    }


}
