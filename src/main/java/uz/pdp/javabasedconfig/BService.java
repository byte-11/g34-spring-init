package uz.pdp.javabasedconfig;

import uz.pdp.xmlbasedconfig.C3Service;

public class BService {

    private final BDao bDao;

    public BService(BDao bDao) {
        this.bDao = bDao;
    }

    public void serve() {
        System.out.println("[" + BService.class.getName() + "] serve() method called");
        bDao.accessData();
    }

    public void init(){
        System.out.println("[" + BService.class.getName() + "] init method called");
        bDao.accessData();
    }
    public void destroy(){
        System.out.println("[" + BService.class.getName() + "] destroy method called");
    }


}
